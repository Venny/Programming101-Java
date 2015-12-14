package week4.Friday.LineSegment;

import week4.Friday.Point.Point;

/**
 * Created by inspired on 13.12.15.
 */
final public class LineSegment implements Comparable {
    private final Point first;
    private final Point second;

    public LineSegment(Point first, Point second){
        if(first.equals(second)){
            this.first = null;
            this.second = null;
            System.err.println("Error! Cannot create a line segment with zero length.");
            return;
        } else {
            this.first =first;
            this.second = second;
        }
    }

    public LineSegment(LineSegment element){
        this.first = element.getFirst();
        this.second = element.getSecond();
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public double getLength(){
        int a = Math.abs(first.getX()) + Math.abs(second.getX());
        int b = Math.abs(first.getY()) + Math.abs(second.getY());

        // using the Pythagorean Theorem
        double length = Math.sqrt(a * a + b * b);

        return length;
    }

    public boolean equals(LineSegment element){
        return first.equals(element.getFirst()) && second.equals(element.getSecond());
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + first.hashCode();
        hash = hash * 23 + second.hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return "Line[(" + first.getX() + ", " + first.getY() + "), (" + second.getX() + ", " + second.getY() + ")]";
    }

    @Override
    public int compareTo(Object o) {
        LineSegment temp = (LineSegment) o;
        Double result = this.getLength() - temp.getLength();
        if(result == 0){
            return 0;
        } else {

        }
        return (int) (this.getLength() - temp.getLength());
    }

    public static void main(String[] args){
        LineSegment segment = new LineSegment(new Point(2, 5), new Point(-5, 16));
        LineSegment segment2 = new LineSegment(new Point(12, -4), new Point(8, 6));
        System.out.println(segment.getLength());
    }
}
