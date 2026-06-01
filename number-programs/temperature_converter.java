import java.io.*;
import java.util.*;
class TEMPCONVERTERscannermethod
{
    public void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER 1 IF YOU CHOOSE TO CONVERT C TO F & ENTER 2 FOR VISE VERSA");
        int choice=scan.nextInt();
        if (choice==1)
        {
            System.out.println("ENTER THE VALUE IN CELCIUS WHICH IS TO BE CONVERTED TO FARENHEIT (IGNORE UNITS)");
            int choice1= scan.nextInt();
            double tempF=(choice1*1.8F)+32;
            System.out.println("THE TEMPERATURE IN FARENHEIT IS " + tempF);
        }
        if (choice==2)
        {
            System.out.println("ENTER THE VALUE IN FARENHEIT WHICH IS TO BE CONVERTED TO CELCIUS (IGNORE UNITS)");
            int choice2= scan.nextInt();
            double tempC=(choice2-32)/1.8F;
            System.out.println("THE TEMPERATURE IN CELCIUS IS " + tempC); 
        }
        
        System.out.println("I am srinidhi P
        
    }
}