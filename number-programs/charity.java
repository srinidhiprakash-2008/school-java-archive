import java.io.*;
class charity
{
    public void main()
    {
        final int dozen=12 ;
        final int gross=144;
        int totalpkts, divpkts, rempkts, totalgross, remgross;
        totalpkts=1193;
        divpkts=totalpkts/dozen;
        rempkts=totalpkts%dozen;
        totalgross=totalpkts/gross;
        remgross=totalpkts%gross;
        System.out.println("THE TOTAL NUMBER OF PACKETS RECIEVED IS " + totalpkts);
        System.out.println("THE GROSS NUMBER OF PACKETS RECIEVED IS " + totalgross);
        System.out.println("THE GROSS NUMBER OF PACKETS REMAINING IS " + remgross);
        System.out.println("THE NUMBER OF DOZENS OF PACKETS IS " + divpkts);
        System.out.println("THE REMAINING NUMBER OF PACKETS IS " + rempkts);
    }
}