//THIS PROGRAM IS DESIGNED TO CACULATE THE INCOME TAX PAYABLE BY THE PERSON ACCORDING TO HIS/HER ANNUAL PAY 
import java.io.*;
import java.util.*;
class prog12
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter the number corresponding to your gender(1 for male / 2 for female)");
        int choice = s.nextInt();
        System.out.println("Enter your salary amount per month");
        double sal = s.nextDouble();
        double annpay=sal*12;
        double tax=0;
        String gender="none";
        if(choice==1)
        gender = "Gentleman";
        {
            if(annpay>=120000)
            {
               tax=0.11*annpay;
            }
        }
        if(choice==2)
        gender= "Lady";
        {
            if(annpay>=700000)
            {
                tax=0.08*annpay;
            }
        }
        System.out.println("The employee's name is : " + name);
        System.out.println("The employee's gender is : " + gender);
        System.out.println("The monthly salary of the employee is : " + sal);
        System.out.println("The annual income of the employee is : " + annpay);
        System.out.println("The income tax payable by the employee is : " + tax);
    }
}