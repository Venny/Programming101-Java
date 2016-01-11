package week07.Monday.FileUtils;

import java.io.*;
import java.nio.file.Path;

/**
 * Created by inspired on 11.01.16.
 */
public class FileUtils {
    private static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {}

    public static String readFrom(File file) throws IOException {
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

    public static String readFrom(Path path) throws IOException {
        return readFrom(path.toFile());
    }

    public void writeTo(String contents, File file) throws IOException {
        try(BufferedWriter buf = new BufferedWriter(new FileWriter(file))){
            buf.write(contents);
        }
    }

    public void writeTo(String contents, Path path) throws IOException {
        writeTo(contents, path.toFile());
    }
}
