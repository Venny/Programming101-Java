package week09.PointGenerator;

import week09.SimpleBlockingQueue.SimpleBlockingQueue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by inspired on 25.01.16.
 */
public class CustomThread implements Runnable {
    private Map<Point, Point> pointsMap;
    private List<Point> data;
    private int index1;
    private int index2;


    public CustomThread(List<Point> data, int index1, int index2, Map<Point, Point> pointsMap) {
        this.pointsMap = pointsMap;
        this.data = data;
        this.index1 = index1;
        this.index2 = index2;
    }

    @Override
    public void run() {
        PointGenerator.doCalculations(data, index1, index2, pointsMap);
    }
}
