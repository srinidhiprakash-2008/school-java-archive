import java.io.*;
class series02
{
    public void main(int n)
    {
        double s=0;
        for(int k=2;k<=n;k=k+2)
        s=s+k/(k+2);
        System.out.println(s);  
    }
}