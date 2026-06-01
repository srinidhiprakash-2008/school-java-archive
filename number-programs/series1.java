import java.io.*;
import java.util.*;
class prog32
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int choice,n;
        double s=0,s1=0,s2=0;
        System.out.println("MAIN MENU");
        System.out.println("1.s=1/2+1/4+1/6...1/n");
        System.out.println("2.s=-1+2-3+4...n");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                {
                    System.out.println("Enter the end value of the series");
                    n=sc.nextInt();
                    for(double a=2;a<=n;a=a+2)
                    {
                        s=s+(1/a);
                    }
                    System.out.println("The value of s is " + s);
                }break;
            case 2:
                {
                    System.out.println("Enter the end value of the series");
                    n=sc.nextInt();
                    for(int b=1;b<=n;b++)
                    {
                        if(b%2==0)
                        {  
                             s1=s1+b;
                        }
                        else
                        {
                             s2=s2+b;
                        }
                        s=s1-s2;
                    }
                    System.out.println("The value of s is " + s);
                }break;
            default:System.out.println("INVALID INPUT! PLEASE ENTER VALID INPUT");
        }
    }
}