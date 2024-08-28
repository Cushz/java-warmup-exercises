package Chapter2;
import java.lang.Math;
public class Point {
    private float x;
    private float y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }


    public float getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt((x*x) + (y*y));
    }


    //Method overloading
    public double distance(Point point)
    {
            return Math.sqrt((Math.pow(point.x-this.x,2) + Math.pow(point.y - this.y,2)));
    }

    public void translate(float dx, float dy)
    {
        x  = x + dx;
        y = y + dy;
    }
}