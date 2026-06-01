import java.io.*;
class scholarship
{
    public void main()
    {
        int totalamt, grp1, grp2, totalcollection, amtremaining, amtremains;
        totalamt=50000;
        grp1=5200;
        grp2=6800;
        totalcollection=grp1+grp2;
        amtremaining=totalamt-totalcollection;
        amtremains=amtremaining/5;
        System.out.println("THE TOTAL SCHOLARSHIP AMOUNT TO BE RAISED IS " + totalamt + "RUPEES");
        System.out.println("GROUP 1's CONTRIBUTION IS " + grp1 + "RUPEES " );
        System.out.println("GROUP 2's CONTRIBUTION IS " + grp2 + "RUPEES " );
        System.out.println("TOTAL CONTRIBUTION MADE BY THE TWO GROUPS IS " + totalcollection + "RUPEES");
        System.out.println("AMOUNT TO BE DIVIDED AMONG 5 GROUPS IS " + amtremaining + "RUPEES");
        System.out.println("AMOUNT EACH GROUP HAS TO RAISE IS " + amtremains + "RUPEES");
    }
}