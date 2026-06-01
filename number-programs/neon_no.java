import java.io.*;
class neon
{
   public void main(int n)
   {
       int sqr=n*n;
       int sum=0;
       for (int i=sqr;i>0;i=i/10)
       {
           int digit= i%10;
            sum=  sum + digit;
       }
       if (sum==n)
       System.out.println("NEON NUMBER");
       else
       System.out.println("NOT A NEON NUMBER");
   }
}
