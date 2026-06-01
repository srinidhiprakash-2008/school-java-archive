//THIS PROGRAM IS DESIGNED TO RUN A USER FRIENDLY INTEREST PROGRAM
import java.io.*;
import java.util.*;
class prog33
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double p,r,ans;
        int choice,t=1;
        System.out.println("MAIN MENU");
        System.out.println("1.Simple Interest calculation(SI)");
        System.out.println("2.Compound Interest calculation(CI)");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                {
                   System.out.println("Enter the principal and the rate of interest to find the simple interest");
                   p=sc.nextDouble();
                   r=sc.nextDouble();
                   ans=(p*t*r)/100;
                   double amt = p + ans;
                   System.out.println("The interest obtained is " + ans);
                   System.out.println("The amount obtained is " + amt);
                }break;
            case 2:
                {
                    System.out.println("Enter the principal, time period and the rate of interest to find the compound interest");
                    p=sc.nextDouble();
                    double time = sc.nextDouble();
                    r= sc.nextDouble();
                    ans=p*Math.pow((100+r)/100,time);
                    double ci = ans-p;
                    System.out.println("The amount obtained is " + ans);
                    System.out.println("The compound interest obtained is " + ci);
                }break;
            default:System.out.println("INVALID INPUT ENTERED! PLEASE ENTER VALID INPUT (1-2)");
        }
    }
}