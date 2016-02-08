package week09_10.FileSearch;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by inspired on 05.02.16.
 */
public class FileFinder {
    public static void findFile(String word, File file){
        File[] list = file.listFiles();

        if (list != null) {
            for(File currentFile:list){
                if(currentFile.isDirectory()){
                    findFile(word, currentFile);
                } else if(file.getName().endsWith(".txt")){
                    // Give the file to the Pool ExecuteService

                }
            }
        }
    }

    public static Map<String, Integer> findTheWord(String name, File file) throws FileNotFoundException {
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line;
        int row = 0;
        Map<String, Integer> list = new HashMap<>();
        try {
            while((line = br.readLine()) != null){
                row++;
                if(line.contains(name)){
                    list.put(file.getAbsolutePath(), row);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
