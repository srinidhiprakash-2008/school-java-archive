import java.io.*;
import java.util.*;
class legend_calculator
{
    public void main()
    {
        Scanner br = new Scanner(System.in);
        System.out.println("ENTER THE FOLLOWING NUMBERS FOR THE RESPECTIVE MATHEMATICAL OPERATIONS");
        System.out.println("1 FOR ADDITION");
        System.out.println("2 FOR SUBTRACTION");
        System.out.println("3 FOR MULTIPLICATION");
        System.out.println("4 FOR DIVISION");
        System.out.println("5 FOR SQUARE ROOT");
        System.out.println("6 FOR CUBE ROOT");
        System.out.println("7 FOR FINDING THE SQUARE OR CUBE OF A NUMBER");
        System.out.println("8 TO EXIT");
        int choice = br.nextInt();
        if(choice==1)
        {   
           System.out.println("ENTER ANY 3 INTEGERS TO BE ADDED");
           int a = br.nextInt();
           int b = br.nextInt();
           int c = br.nextInt();
           int add;
           add=a+b+c;
           System.out.println("THE SUM OF THE NUMBERS GIVEN IS " + add ); 
        }   
        if  (choice==2)
        {
            System.out.println("ENTER THE NUMBERS TO BE SUBTRACTED");
           int d = br.nextInt();
           int e = br.nextInt();
           int subtract;
           subtract=d-e;
           System.out.println("THE DIFFERENCE BETWEEN THE NUMBERS GIVEN IS " + subtract );
        }
        if(choice==3)
        {
           System.out.println("ENTER THE NUMBERS TO BE MULTIPLIED"); 
           double f = br.nextInt();
           double g = br.nextInt();
           double multiply;
           multiply= f * g;
           System.out.println("THE PRODUCT OF THE NUMBERS GIVEN IS " + multiply );
        }
        if(choice == 4)
        {
           System.out.println("ENTER THE DIVIDEND FIRST AND THEN THE DIVISOR");
           int dividend = br.nextInt();
           int divisor = br.nextInt();    
           int divide=dividend/divisor;
           int remainder=dividend%divisor;
           System.out.println("THE QUOTIENT OF THE GIVEN NUMBERS IS " + divide);
           System.out.println("THE REMAINDER LEFT AFTER DIVIDING THE NUMBERS IS " + remainder );
        }
        if(choice==5)
        {
           System.out.println("ENTER THE NUMBER WHOSE SQUARE ROOT IS REQUIRED");
           double sq = br.nextDouble();
           double square = Math.sqrt(sq);
           System.out.println("THE SQUARE ROOT OF " + sq + " IS " + square);
        }
        if(choice==6)
        {
           System.out.println("ENTER THE  NUMBER WHOSE CUBE ROOT IS REQUIRED");
           double cu = br.nextDouble();
           double cube = Math.cbrt(cu);
           System.out.println("THE CUBE ROOT OF " + cu + " IS " + cube);
        }
        else if(choice==7)
        {
            System.out.println("ENTER THE NUMBER WHOSE SQUARE OR CUBE IS REQUIRED");
            int n=br.nextInt();
            System.out.println("ENTER '3' IF THE CUBE OF " + n + " IS REQUIRED OR ENTER '2' IF SQUARE OF " + n + " IS REQUIRED");
            int g=br.nextInt();
            if(g==2)
            {
                int square=n*n;
                System.out.println("THE SQUARE OF" + n + " IS " + square);
            }
            else if(g==3)
            {
                int cube=n*n*n;
                System.out.println("THE CUBE OF " + n + " IS "+ cube);
            }
        }
        else if(choice==8)
        {
            System.out.println("BYE!!! I wish you farewell");
        }
    }
}