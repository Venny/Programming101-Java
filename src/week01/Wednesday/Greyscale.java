package week01.Wednesday;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by inspired on 18.11.15.
 */
public class Greyscale {
    /*  Image histogram */
    public static int[] histogram() {
        int[][] image = getImage();

        for(int i = 0; i < image.length; i++){
            for(int n = 0; n < image[0].length; n++ ){

            }
        }
        return new int[0];
    }

    /* Convert an image into 2nd array */
    private static int[][] getImage() {
        File file = new File("src/week01/images/image.png");
        BufferedImage originalImage = null;
        try {
            originalImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int imageWidth = originalImage.getWidth();
        int imageHeight = originalImage.getHeight();
        int[][] arr = new int[imageWidth][imageHeight];
        for (int i = 0; i < imageWidth; i++) {
            for (int n = 0; n < imageHeight; n++) {
                arr[i][n] = originalImage.getRGB(i, n);
            }
        }

        return arr;
    }
}
