package week09.PointGenerator;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Collections.*;

/**
 * Created by inspired on 03.02.16.
 */
public class PointGenerator {
    private static List<Point> data = new LinkedList<>();
    private static Map<Point, Point> pointsMap = new ConcurrentHashMap<>();
    private static boolean ordered = false;

    public static void main(String[] args){
        Map<Point,Point> nearestPoints = getNearestPoints(generatePoints());
        Thread threadOne = new Thread(new CustomThread(data, 0, 2500, pointsMap));
        Thread threadTwo = new Thread(new CustomThread(data, 2501, 5000, pointsMap));
        Thread threadThree = new Thread(new CustomThread(data, 5001, 7500, pointsMap));
        Thread threadFour = new Thread(new CustomThread(data, 7501, 10000, pointsMap));
        /*Thread threadOne = new Thread(new CustomThread(data, 0, 250, pointsMap));
        Thread threadTwo = new Thread(new CustomThread(data, 251, 500, pointsMap));
        Thread threadThree = new Thread(new CustomThread(data, 501, 750, pointsMap));
        Thread threadFour = new Thread(new CustomThread(data, 751, 1000, pointsMap));*/
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }

    public static List<Point> generatePoints(){
        while(data.size() < 10000){
            Random rNum = new Random();
            Random rNum2 = new Random();
            rNum.nextDouble();
            data.add(new Point(rNum.nextDouble(), rNum2.nextDouble()));
        }
        ordered = false;
        return data;
    }

    public static Map<Point,Point> getNearestPoints(List<Point> generatedPoints){
        for( int i = 0; i < data.size(); i++){
            int index = 0;
            double nearest = 0;
            for(int n = 0; n < data.size(); n++){
                double temp = data.get(i).getDistance(data.get(n));
                if(temp < nearest &&  temp != 0) {
                    nearest = temp;
                    index = n;
                }
            }
            System.out.println(data.get(i).getDistance(data.get(index)));
            pointsMap.put(data.get(i), data.get(index));
        }
        return pointsMap;
    }

    public static void doCalculations(List<Point> inPoints, int indexFrom, int indexTo, Map<Point, Point> outMap) {
        for( int i = indexFrom; i < indexTo; i++){
            int index = 0;
            double nearest = 0;
            for(int n = indexFrom; n < indexTo; n++){
                double temp = data.get(i).getDistance(data.get(n));
                if(temp < nearest &&  temp != 0) {
                    nearest = temp;
                    index = n;
                }
            }
            System.out.println(data.get(i).getDistance(data.get(index)));
            pointsMap.put(data.get(i), data.get(index));
        }
    }

}
