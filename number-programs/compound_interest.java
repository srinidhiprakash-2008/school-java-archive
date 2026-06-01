import java.io.*;
class ci
{
    public void main(int p, int t, int r)
    {
        double finalamt=0,ci=0;
        finalamt=p*Math.pow(((100+r)/100),t);
        ci=finalamt-p;
        System.out.println("THE INTEREST OBTAINED IS " + ci);
    }
}
