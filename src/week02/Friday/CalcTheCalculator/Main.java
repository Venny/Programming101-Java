package week02.Friday.CalcTheCalculator;

import java.util.Scanner;

/**
 * Created by inspired on 29.11.15.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String input = scanner.nextLine();

        while(!input.trim().equals("exit")){
            CalcTheCalculator.evaluate(input.trim());
            System.out.print("Enter expression: ");
            input = scanner.nextLine();
        }
        System.out.println("Bye!");
    }
}
