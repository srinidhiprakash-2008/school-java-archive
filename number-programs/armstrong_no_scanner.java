import java.io.*;
import java.util.*;
class armstrong
{
    public void main()
    {
        Scanner br= new Scanner(System.in);
        int a,digit,sum=0;
        System.out.println("ENTER A 3 DIGIT NUMBER");
        a=br.nextInt();
        for(int i=a;i>0;i=i/10)
        {
            digit=i%10;
            sum=sum+(int)Math.pow(digit,3);
        }
        if(sum==a)
        System.out.println("ARMSTRONG NUMBER");
        else
        System.out.println("NOT AN ARMSTRONG NUMBER");
    }
}
