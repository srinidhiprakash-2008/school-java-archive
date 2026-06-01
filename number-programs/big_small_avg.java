import java.io.*;
class Mathfunc
{
    public static void max(int a ,int b ,int c )
    {
        if(a>b && a>c)
        System.out.println(a + "IS GREATER THAN " + b + "AND " + c );
        else if(b>a && b>c)
        System.out.println(b + "IS GREATER THAN " + a + "AND " + c );
        else if(c>a && c>b)
        System.out.println(c + "IS GREATER THAN " + a + "AND " + b );
    }
    public static void min(int a,int b,int c)
    {
        if(a<b && a<c)
        System.out.println(a + "IS LESSER THAN " + b + "AND " + c );
        else if(b<a && b<c)
        System.out.println(b + "IS LESSER THAN " + a + "AND " + c );
        else if(c<a && c<b)
        System.out.println(c + "IS LESSER THAN " + a + "AND " + b );
    }
    public static void avg(int a, int b, int c)
    {
        double avg;
        avg=(a+b+c)/3;
        System.out.println("THE AVERAGE OF " + a + "," + b + " AND " + c + " IS " + avg); 
    }
}
