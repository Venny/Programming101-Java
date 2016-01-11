package week07.Monday.PropertiesParser;

import week07.Monday.FileUtils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by inspired on 11.01.16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String currentPath = System.getProperty("user.dir");
        String filePath = currentPath + "/testData/.properties";
        File newFile = new File(filePath);
        Map<String, String> mapData = PropertiesParser.parse(newFile);
    }
}
