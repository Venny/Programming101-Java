package ApplicationFall2015.Points;

import java.util.Scanner;

/**
 * Created by Inspired Day on 10/24/2015.
 */
public class Main {
    public static void main(String[] args) {
        /*
        * An input example:
          0 0
          >>><<<~>>>~^^^
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y arguments: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("Enter a path: ");
        String path = scanner.next();

        Points point = new Points(x, y, path);
        int[] newPos = point.findNewPosition();
        System.out.println("");
        System.out.println("Your new position is: " + newPos[0] + " " + newPos[1]);

    }
}
