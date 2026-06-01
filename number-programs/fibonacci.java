import java.io.*;
class fibonacci
{
    public void main(int n)
    {
        int fibo1=0;
        int fibo2=1;
        int fibo;
        System.out.println(fibo1);
        System.out.println(fibo2);
        for(int i=1;i<=n;i++)
        {
            fibo=fibo1+fibo2;
            System.out.println(fibo);
            fibo1=fibo2;
            fibo2=fibo;
        }
    }
}