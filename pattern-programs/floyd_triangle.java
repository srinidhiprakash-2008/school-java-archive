import java.io.*;
class floyd_triangle
{
    public static void main(int n)
    {
        int num=1;
        for(int c=1;c<=n;c++)
        {
            for(int d=1;d<=c;d++)
            {
                System.out.print(num+"");
                num++;
                            }
            System.out.println();
        }
    }
}
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15