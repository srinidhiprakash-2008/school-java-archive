import java.io.*;
import java.util.*;
class primenumberscanner
{
    public void main()
    {
        Scanner anything = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER");
        int n=anything.nextInt();
        int factor=0,a;
        for(a=1;a<=n;a++)
        if(n%a==0)
        {factor=factor+1;}
        if(factor==2)
        System.out.println("PRIME NUMBER");
        else
        System.out.println("COMPOSITE NUMBER");
    }
}