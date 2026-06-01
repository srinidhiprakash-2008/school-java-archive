import java.io.*;
class primeno
{
    public void main(int n)
    {
        int factor=0;
        for(int j=1;j<=n;j++)
        {
            if (n%j ==0)
            factor=factor+1;
        }
        if (factor==2)
        System.out.println("Prime number");
        else
        System.out.println("Composite number");
    }
}
