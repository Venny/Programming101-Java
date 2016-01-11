package week07.Monday.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

/**
 * Created by inspired on 11.01.16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String currentPath = System.getProperty("user.dir");
        String filePath = currentPath + "/testData/A/a";
        File newFile = new File(filePath);
        String data = FileUtils.readFrom(newFile);

    }
}
