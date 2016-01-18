package week07.Monday.FileUtils;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by inspired on 13.01.16.
 */
public class FileUtilsTest {
    private static String currentPath = System.getProperty("user.dir");
    private static String filePath = currentPath + "/testData/A/a";
    private static File newFile = new File(filePath);

    @Category(FastTest.class)
    @Test
    public void testReadFrom() throws Exception {

        int expected = 0;
        String real = FileUtils.readFrom(newFile);
        //assertEquals(expected, real);
        assertTrue(real != null);
    }

    @Parameterized.Parameters()
    public void testWriteTo() throws Exception {

    }
}