import java.io.*;
class pattern3
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//* * * * *
//* * * *
//* * *
//* * 
//*