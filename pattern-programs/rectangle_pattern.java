import java.io.*;
class rect_pattern
{
    public static void main(int l, int b)
    {
        for(int a=1;a<=l;a++)
        {
            System.out.print("*");
            for(int c=1;c<=b;c++)
            {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();
        }
    }
}