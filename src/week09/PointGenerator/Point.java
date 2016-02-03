package week09.PointGenerator;

/**
 * Created by inspired on 03.02.16.
 */
final public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Point getOrigin() {
        return new Point(0, 0);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public boolean equals(Object point) {
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

    public double getDistance(Point secondPoint){
        double a = Math.abs(x - secondPoint.x);
        double b = Math.abs(y - secondPoint.getY());
        return (a * 2 + b * 2)/2;
    }
}

