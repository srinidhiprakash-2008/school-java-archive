import java.io.*;
class prog30
{
    public static void main(int n)
    {
        double s=0;
        for(int a=1;a<=n;a++)
        {
            s=a+s;
        }
        System.out.println("The value of s is " + s);
    }
}