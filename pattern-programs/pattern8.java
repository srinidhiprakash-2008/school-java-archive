import java.io.*;
class pattern8
{
    public static void main(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(""+i);
            }
            System.out.println();
        }
    }
}