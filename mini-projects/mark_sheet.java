//THIS PROGRAM IS TO FIND THE TOTAL,AVERAGE AND THE GRADES WHICH A STUDENT RECIEVES
import java.io.*;
import java.util.*;
class Mark_sheet
{
    double total,average,percentage;
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.nextLine();
        System.out.println("Enter the marks obtained in 4 subjects");
        double sub1=s.nextDouble();
        double sub2=s.nextDouble();
        double sub3=s.nextDouble();
        double sub4=s.nextDouble();
        double total = sub1+sub2+sub3+sub4;
        double average = total/4;
        System.out.println("Name of the student : " + name);
        System.out.println("The total marks obtained : " + total);
        System.out.println("The average marks obtained : " + average);
        if(average>=90)
        {
            System.out.println("The student has been given'A' grade"); 
        }
        else if(average>=80 && average<90)
        {
            System.out.println("The student has been given 'B' grade");
        }
        else if(average>=60 && average<80)
        {
            System.out.println("The student has been given 'C' grade");
        }
        else if(average<60)
        {
            System.out.println("The student has been given 'D' grade");
        }
    }
}