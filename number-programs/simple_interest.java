import java.io.*;
import java.util.*;
class si
{
    public void main(double p, double r)
    {
        int t = 1;
        double si;
        si=(p*t*r)/100;
        double amt = si + p;
        System.out.println("THE PRINCIPAL IS " + p);
        System.out.println("THE RATE OF INTEREST IS" + r);
        System.out.println("THE TIME PERIOD IS "+ t);
        System.out.println("THE INTEREST OBTAINED IS " + si);
        System.out.println("THE AMOUNT OBTAINED IS  " + amt);
        Scanner s = new Scanner (System.in);
        System.out.println("ENTER THE NEXT YEAR'S PRINCIPAL AND RATE OF INTEREST ");
        double pr = s.nextInt();
        double ri = s.nextDouble();
        double simplei = (pr * ri * t)/100;
        double amt1 = simplei + pr;
        System.out.println("THE SIMPLE INTEREST OBTAINED IS " + simplei);
        System.out.println("THE AMOUNT IS "+ amt1);
    }
}