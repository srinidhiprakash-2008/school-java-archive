import java.io.*; 
class isosceles_inverted 
{
    public static void main(int rows)
    {
        int i=1;
        while ( i <= rows) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = rows; k >= i; k--) 
            {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}
