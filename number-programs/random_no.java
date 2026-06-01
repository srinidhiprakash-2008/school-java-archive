import java.io.*;
class randomnumber
{
    public static void main()
    {
        int min=1,max=6;
        int range=max-min+1;
        int random1=(int)(Math.random()*range+min);
        System.out.println("ROLL 1:" + random1);
        int random2=(int)(Math.random()*range+min);
        System.out.println("ROLL 2:" + random2);
        int random3=(int)(Math.random()*range+min);
        System.out.println("ROLL 3:" + random3);
        int random4=(int)(Math.random()*range+min);
        System.out.println("ROLL 4:" + random4);
    }
}