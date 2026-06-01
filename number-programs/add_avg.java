import java.io.*;
import java.util.*;
class addscanner
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE THREE NUMBERS WHICH YOU NEED TO ADD AND FIND THE AVERAGE");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("THE FIRST NUMBER IS " + a);
        System.out.println("THE SECOND NUMBER IS " + b);
        System.out.println("THE THIRD NUMBER IS " + c);
        double sum, avg;
        sum = a + b + c ;
        avg = sum/3;
        System.out.println("THE SUM OF THE THREE NUMBERS IS " + sum);
        System.out.println("THE AVERAGE OF THE THREE NUMBERS IS " + avg);
    }
}