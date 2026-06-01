import java.io.*;
class dowhile2
{
    public void main()
    {
        int count = 0, n = 0;
        do
        {
            n=n+1;
            count=count + 1;
            System.out.println(n);
        }
        while(n<10);
        System.out.println("THE NUMBER OF TIMES LOOP IS REPEATED IS  " + count);
    }
}