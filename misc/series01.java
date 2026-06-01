import java.io.*;
class series01
{
    public void main(int n)
    {
        double s=0;
        for(int i=1;i<=n;i++)
        s=(s+1/i);
        System.out.println(s);
    }
}