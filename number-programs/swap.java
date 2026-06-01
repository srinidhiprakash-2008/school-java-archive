import java.io.*;
class swap
{
    public void main()
    {
        int x=1331,y=343,temp;
        System.out.println("THE NUMBERS BEFORE SWAPPING ARE:- X =" + x + "AND Y =" + y );
        temp=x;
        x=y;
        y=temp;
        System.out.println("THE NUMBERS AFTER SWAPPING ARE:- X =" + x + "AND Y= " + y);
    }
}