import java.io.*;
class distanceformula
{
    public static void main(int x1, int y1, int x2, int y2)
    {
        double distance;
        double a = x2-x1;
        double b = y2-y1;
        distance=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("THE DISTANCE BETWEEN THE POINTS IS " + distance);
    }
}