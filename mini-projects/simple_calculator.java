import java.io.*;
import java.util.*;
class SWITCHINCASEcalc
{
    public void main()
    {
        int choice;
        double a,b,c;
        Scanner br= new Scanner(System.in);
        System.out.println( "MAIN MENU");
        System.out.println( "1.Addition");
        System.out.println( "2.Subtraction");
        System.out.println( "3.Multiplication");
        System.out.println( "4.Division");
        System.out.println( "Enter your choice");
        choice=br.nextInt();
        switch(choice)
        {
            case 1:
                {
                    System.out.println("Enter the I value");
                    a=br.nextDouble();
                    System.out.println("Enter the II value");
                    b=br.nextDouble();
                    c=a+b;
                    System.out.println("The sum is "+c);
                }break;

            case 2:
                {
                    System.out.println("Enter the I value");
                    a=br.nextDouble();
                    System.out.println("Enter the II value");
                    b=br.nextDouble();
                    c=a-b;
                    System.out.println("The difference value is "+c);
                }break;

            case 3:
                {
                    System.out.println("Enter the I value");
                    a=br.nextDouble();
                    System.out.println("Enter the II value");
                    b=br.nextDouble();
                    c=a*b;
                    System.out.println("The product value is "+c);
                }break;
            case 4:
                {
                    System.out.println("Enter the I value");
                    a=br.nextDouble();
                    System.out.println("Enter the II value");
                    b=br.nextDouble();
                    c=a/b;
                    System.out.println("The quotient value is "+c);
                }break;
            default:
                System.out.println("Enter the valid input"); 
        }     
    }                      
}                        
