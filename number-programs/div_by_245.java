import java.io.*;
class div245
{
    public void main(int n)
    {
        boolean divby2 = false, divby4 = false, divby5 = false;
        int lastdigit , last2digits;
        lastdigit=n%10;
        last2digits=n%100;
        if ( lastdigit== 0 || lastdigit== 2 || lastdigit== 4 || lastdigit== 6 || lastdigit==8)
        divby2 = true ;
        if(lastdigit== 0 || lastdigit== 5 )
        divby5 = true ;
        if(last2digits%4==0)
        divby4 = true ;
        if (divby2 == true && divby5 == true && divby4 == true )
        System.out.println("DIVISIBLE BY 2,4 AND 5");
        else
        System.out.println("NOT DIVISIBLE BY EITHER 2 OR 4 OR 5");
    }
}