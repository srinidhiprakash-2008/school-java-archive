import java.io.*; 
class factorial
{
    public void main(int n)
    {
        double sum=0;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.println(sum + "");
    }
}
