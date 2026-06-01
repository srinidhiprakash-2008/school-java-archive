import java.io.*;
class rupee
{
    public static void main(int rupees)
    {
        int r2000=0,r1000=0,r500=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
        int bal=rupees;
        r2000=bal/2000;
        bal=bal%2000;
        r1000=bal/1000;
        bal=bal%1000;
        r500=bal/500;
        bal=bal%500;
        r100=bal/100;
        bal=bal%100;
        r50=bal/50;
        bal=bal%50;
        r20=bal/20;
        bal=bal%20;
        r10=bal/10;
        bal=bal%10;
        r5=bal/5;
        bal=bal%5;
        r2=bal/2;
        bal=bal%2;
        r1=bal/1;
        bal=bal%1;
        System.out.println("THE AMOUNT WHICH YOU ENTERED IS " + rupees);
        System.out.println("2000 RUPEE NOTES :" + r2000);
        System.out.println("1000 RUPEE NOTES :" + r1000);
        System.out.println("500 RUPEE NOTES :" + r500);
        System.out.println("100 RUPEE NOTES :" + r100);
        System.out.println("50 RUPEE NOTES :" + r50);
        System.out.println("20 RUPEE NOTES :" + r20);
        System.out.println("10 RUPEE NOTES :" + r10);
        System.out.println("5 RUPEE NOTES :" + r5);
        System.out.println("2 RUPEE NOTES :" + r2);
        System.out.println("1 RUPEE NOTES :" + r1);
        
    }
}