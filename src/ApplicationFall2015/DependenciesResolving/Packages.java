package ApplicationFall2015.DependenciesResolving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Vector;

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

    public HashMap getIndex(){
        return (HashMap) index.clone();
    }

    private void initIndex(){
        Vector<String> file = readFile();
        Vector<String> temp = new Vector<>();
        for(int i = 0; i < file.size(); i++){
            temp.add(file.get(i).replaceAll("(\\\"|\\'|\\,|\\[|\\]|\\{|\\})", ""));
            addKeyValue(temp.get(i).trim());
        }
    }

    private Vector<String> readFile(){
        URL url = getClass().getResource(packages);
        Vector<String> jsonArr = new Vector<>();
        try{
            File file = new File(url.toURI());
            BufferedReader bufferReader = new BufferedReader(new FileReader(file));
            String line = bufferReader.readLine();
            while(line != null){
                jsonArr.add(line);
                line = bufferReader.readLine();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return jsonArr;
    }

    private void addKeyValue(String pair){
        if(pair.length() > 1){
            String[] pairArr = pair.split(":");
            String key = pairArr[0].trim();
            String value = pairArr.length > 1? pairArr[1].trim(): "";
            index.put(key, value);
            //System.out.println(key + " : " + value);
        }
    }
}
