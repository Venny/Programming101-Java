package week07.Wednesday.wordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by inspired on 13.01.16.
 */
public class WordCount {
    public static WordCountResult wordCount(Path path) throws IOException {
        String fileString = readFrom(path.toFile());
        return null;
    }

    private static String readFrom(File file) throws IOException {
        StringBuilder builder  = null;
        BufferedReader buff = null;
        try{
            buff = new BufferedReader(new FileReader(file));
            String line = null;
            builder = new StringBuilder();
            while((line = buff.readLine()) != null ){
                builder.append(line);
                builder.append(System.lineSeparator());
            }
        } finally{
            if(buff != null) {
                buff.close();
            }
        }
        return builder.toString();
    }
}
