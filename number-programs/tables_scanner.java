import java.io.*;
import java.util.*;
class tables2scanner
{
    public void main()
    {
        int x=1,y;
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is to be known");
        int number = br.nextInt();
        while(x<=10)
        {
            y=number*x;
            System.out.println(number + " X " + x + " = " + y);
            x=x+1;
        }
    }
}