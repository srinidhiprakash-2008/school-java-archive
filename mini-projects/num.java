import java.io.*;
class num
{
    public static void prime_number(int n)
    {
        int factor=0;
        int a;
        for(a=1;a<=n;a++)
        if (n%a==0)
        factor=factor+1;
        if (factor==2)
        System.out.println("PRIME NUMBER");
        else
        System.out.println("COMPOSITE NUMBER");
    }
    public static void factorial_of_a_number(int n)
    {
        int fact=1,a;
        for(a=1;a<=n;a++)
        {
            fact=fact*a;
        }
        System.out.println(fact+"");
    }
    public static void factorial_series(int n)
    {
        int fact=1,a;
        double sum=0;
        for(a=1;a<=n;a++)
        {
            fact=fact*a;
            sum=sum+fact;
        }
        System.out.println(sum+"");
    }
    public static void neon_number(int n)
    {
        int sqr=n*n,sum=0;
        for(int i=sqr;i!=0;i=i/10)
        {
            int digit=i%10;
            sum=sum+digit; 
        }
        if (n==sum)
        System.out.println("NEON NUMBER");
        else
        System.out.println("NOT A NEON NUMBER");
    }
    public static void fibonacci_series(int n)
    {
        int fibo,fibo1=0,fibo2=1;
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
    public static void armstrong_number(int n)
    {
        int digit,sum=0;
        for(int i=n;i>0;i=i/10)
        {
            digit=i%10;
            sum=sum+(int)Math.pow(digit,3);
        }
        if (sum==n)
        System.out.println("ARMSTRONG NUMBER");
        else
        System.out.println("NOT AN ARMSTRONG NUMBER");
    }
    public static void perfect_number(long num)
    {
        long sum=0;
        for(int a=1;a<=num/2;a++)
        {
            if(num%a==0)
            {
                sum=sum+a;
            }
        }
        if(num==sum)
        System.out.println("Perfect number");
        else
        System.out.println("Not a perfect number");
    }
    public static void special_number(int number)
    {
        int num,ldigit,sumoffact=0;
        num=number;
        while(number>0)
        {
            ldigit=number%10;
            int fact=1;
            for(int i=1;i<=ldigit;i++)
            {
                fact=fact*i;
            }
            sumoffact=sumoffact+fact;
            number=number/10;
        }
        if (num==sumoffact)
        System.out.println("SPECIAL NUMBER");
        else
        System.out.println("NOT A SPECIAL NUMBER");
    }
    public static void palindrome(int n)
    {
        int sum=0,r,temp=n;
        for(int a=n;n>0;n=n/10)
        {
            r=n%10;
            sum=(sum*10)+r;
        }
        if(temp==sum)
        System.out.println("PALINDROME NUMBER");
        else
        System.out.println("NOT A PALINDROME NUMBER");
    }
}