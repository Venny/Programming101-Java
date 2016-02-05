package week09.FileSearch;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by inspired on 05.02.16.
 */
public class FileFinder {
    public static void findFile(String name, File file){
        File[] list = file.listFiles();

        if (list != null) {
            for(File currentFile:list){
                if(currentFile.isDirectory()){
                    findFile(name, currentFile);
                } else if(file.getName().endsWith(".txt")){
                    // Give the file to the Pool
                }
            }
        }
    }

    public static Map<String, String> findTheWord(String name, File file) throws FileNotFoundException {
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line;
        Map<String, String> list = new HashMap<>();
        try {
            while((line = br.readLine()) != null){
                if(line.contains(name)){
                    list.put(file.getAbsolutePath(), file.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
