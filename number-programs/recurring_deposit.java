import java.io.*;
import java.util.*;
class rd
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double p=sc.nextDouble();
        System.out.println("Enter the time in months");
        double t=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double r=sc.nextDouble();
        double tad=p*t;
        double interest=(p*t*(t+1)*r)/2400;
        double mv=interest+tad;
        System.out.println("The interest obtained is " + interest);
        System.out.println("The Maturity value obtained is " + mv);
    }
}