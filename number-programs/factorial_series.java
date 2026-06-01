import java.io.*;
class factseries
{
    public static void main(int n)
    {
        double sum=0;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.println(sum+"");
    }
    public static void main1(int n)
    {
        double sum=0;
        int fact=1,i=1;
        do
        {
        fact=fact*i;
        sum=sum+fact; 
        i=i+1;    
        }
        while(i<=n);
        System.out.println(sum + "");
    }

}