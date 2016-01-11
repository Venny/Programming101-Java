package week07.Monday.PropertiesParser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by inspired on 11.01.16.
 */
public class PropertiesParser {
    private static Map<String, String> parseProperties = new HashMap<>();
    public static Map<String, String> parse(File file) throws IOException {
        BufferedReader buff = null;
        String line = null;
        try{
            buff = new BufferedReader(new FileReader(file));

            while((line = buff.readLine()) != null){
                //System.out.println((buff.readLine()));
                addInMap(line);
            }
        } finally {
            if(buff != null) {
                buff.close();
            }
        }
        return parseProperties;
    }

    private static void addInMap(String line){
        if(line.charAt(0) == '#'){
            return;
        }
        String trimmedLine = line.replaceAll("\\s","");
        String[] pair = trimmedLine.split("=", 2);
        System.out.println(pair[0] + " " + pair[1]);
        parseProperties.put(pair[0], pair[1]);
    }
}
