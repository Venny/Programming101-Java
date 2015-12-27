package week4.Friday.Triangle;

import week4.Friday.Point.Point;

/**
 * Created by inspired on 16.12.15.
 */
final public class Triangle {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        if(checkAxis('x') || checkAxis('y')) {
            System.err.println("Points are on the same axis.");
        }
    }

    public Triangle(Triangle tr){
        this.point1 = tr.getPoint1();
        this.point2 = tr.getPoint2();
        this.point3 = tr.getPoint3();
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    private boolean checkAxis (char n){
        if(n == 'x') {
            return point1.getX() == point2.getX() && point1.getX() == point3.getX();
        }

        return point1.getY() == point2.getY() && point1.getY() == point3.getY();
    }

}
