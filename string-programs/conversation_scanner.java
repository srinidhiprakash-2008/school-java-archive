import java.io.*;
import java.util.*;
class conversation_scanner
{
    public void main()
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Hi there. What's your name?");
        String n = s.nextLine();
        System.out.println("HELLO " + n );
        String m = s.nextLine();
        System.out.println( n + ",in which class are you studying?");
        String a = s.nextLine();
        System.out.println("Hope you are studying fine in class " + a + ".");
        String o = s.nextLine();
        System.out.println("How are your parents? I hope they are fit and fine.");
        String p = s.nextLine();
        System.out.println("I FEEL SORRY FOR YOUR LOSS. WELL, I BID YOU FAREWELL MY FRIEND");
        String b =s.nextLine();
    }
}