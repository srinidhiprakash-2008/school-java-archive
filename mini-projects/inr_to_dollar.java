//THIS PROGRAM IS DESIGNED TO CONVERT INR TO DOLLARS AND VISE-VERSA
import java.io.*;
import java.util.*;
class prog28
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter 1 to convert INR to American dollars ");
        System.out.println("Else enter 2 to convert American dollars to INR");
        int choice = sc .nextInt();
        switch(choice)
        {
           case 1:
           {
               System.out.println("Enter the value which is to be converted from INR to dollars");
               double rupee = sc.nextDouble();
               double dollar = 0.0121*rupee;
               System.out.println("The converted currency is " + dollar + "$");
           }break;
           case 2:
           {
               System.out.println("Enter the value which is to be converted from dollars to INR");
               double dollar= sc.nextDouble();
               double rupee = dollar/0.0121;
               System.out.println("The converted currency is  ₹" + rupee);
           }break;
           default:System.out.println("Invalid input entered");
        }
    }
}