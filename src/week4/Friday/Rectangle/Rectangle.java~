package week4.Friday.Rectangle;

import week4.Friday.LineSegment.LineSegment;
import week4.Friday.Point.Point;

/**
 * Created by inspired on 14.12.15.
 */
final public class Rectangle {
    private final Point upperLeft;
    private final Point lowerRight;
    private final Point upperRight;
    private final Point lowerLeft;

    public Rectangle(Point upperLeft, Point lowerRight){
        if(upperLeft.getX() == lowerRight.getX() || upperLeft.getY() == lowerRight.getY()){
            System.err.println("Points are on the same axis.");
        }

        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
        this.upperRight = new Point(upperLeft.getX(), lowerRight.getY());
        this.lowerLeft = new Point(upperLeft.getX(), lowerRight.getY());
    }

    public Rectangle(Rectangle figure){
        this.upperLeft = figure.getUpperLeft();
        this.lowerRight = figure.getLowerLeft();
        this.upperRight = figure.getUpperRight();
        this.lowerLeft = figure.getLowerRight();
    }

    public Point getUpperLeft(){
        return upperLeft;
    }

    public Point getLowerLeft(){
        return lowerLeft;
    }

    public Point getUpperRight(){
        return upperRight;
    }

    public Point getLowerRight(){
        return  lowerRight;
    }

    public LineSegment getUpperEdge(){
        return new LineSegment(upperLeft, upperRight);
    }

    public LineSegment getLowerEdge(){
        return new LineSegment(lowerLeft, lowerRight);
    }

    public LineSegment getRightEdge(){
        return new LineSegment(upperRight, lowerRight);
    }

    public LineSegment getLeftEdge(){
        return new LineSegment(upperLeft, lowerLeft);
    }

    public double getWidth(){
        return getUpperEdge().getLength();
    }

    public double getHeight() {
        return getLeftEdge().getLength();
    }

    public Point getCenterPoint(){
        double x = upperLeft.getX() + (getWidth() / 2);
        double y = upperLeft.getY() + (getHeight() / 2);
        return new Point(x, y);
    }

    public double getPerimeter(){
        return getHeight() * 2 + getWidth() * 2;
    }

    public double getArea(){
        return getHeight() * getWidth();
    }

    public String toString(){
        return "Rectangle[(" + upperLeft.getX() + ", " + upperLeft.getY() + "), (" + getHeight() + ", " + getWidth() + ")]";
    }

    public boolean equals(Object rect){
        return upperLeft.equals(((Rectangle) rect).getUpperLeft()) && lowerRight.equals(((Rectangle) rect).getLowerRight());
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + upperLeft.hashCode();
        hash = hash * 23 + lowerRight.hashCode();
        return hash;
    }

    private boolean checkPosition(int n1, int n2){
        return n1 > n2;
    }
}
