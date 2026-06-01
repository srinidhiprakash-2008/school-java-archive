import java.io.*;
class calculator
{
    public void add(int a, int b, int c)
    {
        int add;
        add=a+b+c;
        System.out.println("THE SUM OF THE NUMBERS GIVEN IS " + add ); 
        System.out.println("/u000c");
    }
    public void subtract(int a, int b)
    {
        int subtract;
        subtract=a-b;
        System.out.println("THE DIFFERENCE BETWEEN THE NUMBERS GIVEN IS " + subtract );
        System.out.println("/u000c");
    }
    public void multiply(int a, int b)
    {
        int multiply;
        multiply= a * b ;
        System.out.println("THE PRODUCT OF THE NUMBERS GIVEN IS " + multiply );
        System.out.println("/u000c");
    }
    public void divide(int dividend, int divisor)
    {
        int divide, remainder;
        divide=dividend/divisor;
        remainder=dividend%divisor;
        System.out.println("THE QUOTIENT OF THE GIVEN NUMBERS IS " + divide);
        System.out.println("THE REMAINDER LEFT AFTER DIVIDING THE NUMBERS IS " + remainder );
        System.out.println("/u000c");
    }
}