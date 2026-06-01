import java.io.*;
import java.util.*;

class helloSCANNER
{
   public void main()
   {
       Scanner name= new Scanner (System.in);
       System.out.println("ENTER YOUR NAME");
       String n = name.nextLine();
       System.out.println("HELLO " + n + " ! ");
   }
}