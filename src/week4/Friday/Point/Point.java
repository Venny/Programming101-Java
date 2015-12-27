package week4.Friday.Point;

import week4.Friday.LineSegment.LineSegment;

/**
 * Created by inspired on 11.12.15.
 */
final public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static Point getOrigin(){
        return new Point(0, 0);
    }

    @Override
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }

    public boolean equals(Object point){
        return this.x == ((Point) point).getX() && this.y == ((Point) point).getY();
    }

    public int hashCode() {
        int hash = 17;
        Double x1 = x;
        Double y1 = y;

        hash = (hash * 23) + x1.hashCode();
        hash = hash * 23 + y1.hashCode();
        return hash;
    }

    public static LineSegment Add(Point point1, Point point2){
        return new LineSegment(point1, point2);
    }
}
