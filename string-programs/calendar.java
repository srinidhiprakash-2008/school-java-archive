import java.util.*;
class calendar
{
    public static void main()
    {
        Calendar c= Calendar.getInstance();
        System.out.println("TODAY'S DATE IS " + (c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.DATE)+"/"+c.get(Calendar.YEAR)));
        System.out.println(c.get(Calendar.HOUR)+"/"+c.get(Calendar.MINUTE)+"/"+c.get(Calendar.SECOND)+"/"+c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.DAY_OF_MONTH)+"/"+c.get(Calendar.DAY_OF_WEEK)+"/"+c.get(Calendar.DAY_OF_YEAR));
    }
    public static void main1()
    {
        Date d=new Date();
        System.out.println("THE DATE IS "+ d);
    }
}