//THIS PROGRAM IS DESIGNED TO PRINT THE SALARY SLIP OF AN EMPLOYEE
import java.io.*;
import java.util.*;
class prog11
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the employee's name");
        String name = s.nextLine();
        System.out.println("Enter the employee's basic salary");
        double b = s.nextDouble();
        System.out.println("Enter the employee's badge number");
        long num = s.nextLong();
        double dra=0.4*b;
        double hra=0.2*b;
        double pf=0.12*b;
        double npay=(b+dra+hra)-pf;
        System.out.println("\t"+"EMPLOYEE'S SALARY SLIP");
        System.out.println("Employee's name: " + name);
        System.out.println("The badge number of the employee : " + num);
        System.out.println("The basic salary of the employee : " + b);
        System.out.println("Dearness Allowance : " + dra);
        System.out.println("House Rent Allowance : " + hra);
        System.out.println("Provident Fund : " + pf);
        System.out.println("Net amount paid to the employee " + npay);
    }
}