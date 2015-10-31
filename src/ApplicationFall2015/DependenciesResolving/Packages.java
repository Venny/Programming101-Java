package ApplicationFall2015.DependenciesResolving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;

/**
 * Created by Inspired Day on 10/25/2015.
 */
public class Packages {
    private String packages = "";
    private HashMap<String, String> index = new HashMap<>();

    public Packages(String packages){
        this.packages = packages;
        initIndex();
    }

    private String readFile(){
        String result = "";
        URL url = getClass().getResource(packages);
        try{
            File file = new File(url.toURI());
            BufferedReader bufferReader = new BufferedReader(new FileReader(file));
            StringBuilder packages = new StringBuilder();
            String line = bufferReader.readLine();
            while(line != null){
                packages.append(line);
                line = bufferReader.readLine();
            }
            result = packages.toString();
        } catch(Exception e){
            e.printStackTrace();
        }

        return result.replaceAll("\\s","");
    }

    private void initIndex(){
        String file = readFile().replaceAll("(\\\"|\\'|\\[|\\{|\\})", "");
        file = file.substring(0, file.length() - 1); // Remove only the last parenthesis ']'
        String[] jsonParts = file.split("],");
        for(String str:jsonParts){
            addKeyValue(str);
        }
    }

    private void addKeyValue(String pair){
        String[] pairArr = pair.split(":");
        String key = pairArr[0];
        String value = pairArr.length > 1? pairArr[1]: "";
        index.put(key, value);
    }
}
