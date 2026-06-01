import java.io.*; 
class factorial2
{
    public void main(int n)
    {
        double sum=0;
        int fact=1;
        int i=1;
        while(i<=n)
        {
            i=i+1;
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.println(sum + "");
    }
}
