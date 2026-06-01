import java.io.*; 
class isosceles_upright 
{
    public static void main(int rows)
    {
        int i=1;
        while ( i <= rows) 
        {
            for (int j = rows; j >= i; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}