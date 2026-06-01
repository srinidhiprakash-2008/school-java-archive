import java.io.*;
class string_pattern
{
    public static void main()
    {
        int i,j,k;
        char ch;
        String word="I am a human";
        int n = word.length();
        for(i=0;i<n;i++)
        {
            k=0;
            for(j=0;j<=i;j++)
            {
                ch = word.charAt(k);
                k++;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}