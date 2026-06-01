import java.io.*;
import java.util.*;
class tables2
{
    public void main()
    {
        int x=1,y;
        Scanner br = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHOSE MULTIPLICATION TABLE YOU WANT TO KNOW");
        int number = br.nextInt();
        while(x<=10)
        {
            y=number*x;
            System.out.println(number + " X " + x + " = " + y);
            x=x+1;
        }
    }
}