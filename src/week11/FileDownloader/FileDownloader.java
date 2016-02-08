package week11.FileDownloader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by inspired on 08.02.16.
 */
public class FileDownloader {
    public static void main(String[] args) throws IOException {
        String url = "http://www.keenthemes.com/preview/conquer/assets/plugins/jcrop/demos/demo_files/image1.jpg";
        String destinationFile =  "src" + File.separator +  "resources" + File.separator + "image.jpg";
        downloadImage(url, destinationFile);
    }

    public static void downloadImage(String url, String destinationFIle) throws IOException {
        URL imageUrl = new URL(url);
        InputStream image = imageUrl.openStream();
        OutputStream output = new FileOutputStream(destinationFIle);

        byte[] b = new byte[2048];
        int length = 0;

        while ((length = image.read(b)) != -1 ){
            output.write(b, 0, length);
        }
        image.close();
        output.close();
        System.out.println("Success!");
    }


}
