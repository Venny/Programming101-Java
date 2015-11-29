package week01.Friday;

import java.util.Calendar;

/**
 * Created by inspired on 25.11.15.
 */
public class FridayYears {
    public static void main(String[] args){
        fridayYears("1000", "2000");
        fridayYears("1753", "2000");
        fridayYears("1990", "2015");
    }

    public static void fridayYears(String start, String end){
        int startYear = Integer.parseInt(start);
        int endYear = Integer.parseInt(end);
        int fridayYears = 0;

        for(int i = startYear; i <= endYear; i++){
            if(findAFridayYear(i)){
                fridayYears ++;
            }
        }
        System.out.println(fridayYears);
    }

    private static boolean findAFridayYear(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year); // Set only year

        return calendar.get(Calendar.WEEK_OF_YEAR) > 48;
    }
}
