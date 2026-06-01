import java.io.*;
class operation1
{
    public void main(int x)
    {
        x+=++x-(++x)*(--x);
        System.out.println("THE RESULTING VALUE IS"+x);
    }
}