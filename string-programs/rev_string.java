import java.io.*;
import java.util.*;
class S2
{
    public static void main()
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String s1 = br.next();
        String s2 = "";
        int a = s1.length();
        for(int i = (a-1); i>0 ; i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
}