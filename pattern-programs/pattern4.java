import java.io.*;
class pattern4
{
    public static void main(int n)
    {
        for(int c=1;c<=n;c++)
        {
            for(int d=n;d>=c;d--)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
//11111
//2222
//333
//44
//5