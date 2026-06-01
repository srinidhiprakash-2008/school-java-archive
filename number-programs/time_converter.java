import java.io.*;
class timeconverter
{
    public void main(int total_mins)
    {
        final int totalminsinhour=60;
        final int totalhourinday=24;
        int tothrs;
        int tmins;
        int days = 0,hours = 0, mins = 0;
        System.out.println("THE ENTERED MINUTE VALUE IS " + total_mins);
        tmins=total_mins;
        tothrs= total_mins/totalminsinhour;
        days=tothrs/totalhourinday;
        hours=tothrs%totalhourinday;
        mins=tmins%totalminsinhour;
        System.out.println("TOTAL MINUTES  " + mins + "  NUMBER OF DAYS " + days + " NUMBER OF HOURS "+ hours );
    }
}