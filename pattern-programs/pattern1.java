import java.io.*;
class pattern1
{
    public static void main(int n)
    {
        for(int c=1;c<=n;c++)
        {
            for(int d=1;d<=c;d++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5