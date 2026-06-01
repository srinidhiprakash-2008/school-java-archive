import java.io.*;
import java.util.*;
class prog29
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the number which is to be checked");
        int n = sc.nextInt();
        int a=n;
        while(n>0)
        {
            int digit = n%10;
            n = n/10;
            if( digit == 0)
            flag = 1;
        }
        if( flag == 1)
        System.out.println(a + " is a duck number");
        else
        System.out.println(a+ " is not a duck number");
    }
}