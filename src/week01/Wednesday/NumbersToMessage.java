package week01.Wednesday;

import java.util.HashMap;

/**
 * Created by inspired on 23.11.15.
 */
public class NumbersToMessage {
    public static void main(String[] args){
        //System.out.println( numbersToMessage(new int[]{2, -1, 2, 2, -1, 2, 2, 2}) );
        //System.out.println( numbersToMessage(new int[]{1,2,3,4,5,6,7,8,9,10,11,0,12,13,14,15,16,0,17,18,19,20,21,22,23,24,25,26, 27} ) );
        //System.out.println( numbersToMessage(new int[]{1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2} ) );
        //System.out.println( numbersToMessage(new int[]{2, -1, 2, -1, 2, 2, -1, 2, 2, -1, 2, 2, 2, -1, 2, 2, 2} ) );
        messageToNumbers("abc  z");
    }

    private static final HashMap<Integer, int[]> LETTERSMAP = generateMap();

    public static String numbersToMessage(int[] pressedSequence){
        String message = "";
        boolean notCapital = true;
        int counter = 0;
        for (int i = 0; i < pressedSequence.length; i++){
            switch (pressedSequence[i]){
                case 0:
                    message += " ";
                    break;
                case 1:
                    notCapital = false;
                    break;
                case -1:
                    char current = getLetter(pressedSequence[i - 1], counter);
                    message += (notCapital)? current: Character.toUpperCase(current);
                    notCapital = true;
                    counter = 0;
                    break;
                default:
                    counter++;
                    if( i == pressedSequence.length - 1){
                        message += getLetter(pressedSequence[i], counter);
                        break;
                    }
                    if(pressedSequence[i] != pressedSequence[i + 1] && pressedSequence[i + 1] != -1 ){
                        char temp = getLetter(pressedSequence[i], counter);
                        message += (notCapital)? temp: Character.toUpperCase(temp);
                        notCapital = true;
                        counter = 0;
                    }
                    break;
            }
        }
        return message;
    }

    public static int[] messageToNumbers(String message){
        char[] messageArr = message.toCharArray();
        for(char letter:messageArr){

            // Transform the letter to number
            int temp = Character.getNumericValue(letter);
            System.out.println(temp - 10);
        }
        return null;
    }

    private static char getLetter(int letter, int counter){
        int[] key = LETTERSMAP.get(letter);
        int singleLetter = 0;
        counter -= 1; // The counter starts from 1, but the items in the array from 0;

        if(counter < key.length){
            singleLetter = key[counter];
        } else {
            int index = 0;
            while( counter > 1 ){
                System.out.println(counter + " " + index);
                index ++;
                counter--;
                if(index == key.length - 1){
                    index = 0;
                }
            }
            singleLetter = key[index];
        }

        // Transform the number to a lower case
        char temp = (char) (singleLetter + 97);
        return temp;
    }

    private static int getNum(int letter){
        return 0;
    }

    private static HashMap<Integer, int[]> generateMap(){
        HashMap<Integer, int[] > map = new HashMap();

        // Put elements to the map
        map.put(2, new int[]{0, 1, 2});
        map.put(3, new int[]{3, 4, 5});
        map.put(4, new int[]{6, 7, 8});
        map.put(5, new int[]{9, 10, 11});
        map.put(6, new int[]{12, 13, 14});
        map.put(7, new int[]{15, 16, 17, 18});
        map.put(8, new int[]{19, 20, 21});
        map.put(9, new int[]{22, 23, 24, 25});

        return map;
    }
}
