import java.io.*;
class series
{
    public static void main(int n)
    {
        double s=0;
        for(double i=2;i<=n;i++)
        s=(1/i)+s;
        System.out.println("THE VALUE OF S IS " + s);
    }
    public static void main1(int n)
    {
        double s=0;
        for(int j=1;j<n;j++)
        s=(j/j+2)+s;
        System.out.println("THE VALUE OF S IS " + s);
    }
    public static void main2(int n)
    {
        double s=0;
        for(int i=1;i<=n;i++)
        s=(n/n+2)+s;
        System.out.println("THE VALUE OF S IS " + s);
    }
}