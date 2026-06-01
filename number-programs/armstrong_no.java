import java.io.*;
class armstrong1
{
    public void main()
    {
      int num=147,origno=num,rem,result=0;
    while(origno!=0)
    {
       rem=origno%10;
       result+=Math.pow(rem,3);
       origno/=10;
    }  
    if (result==origno)
    System.out.println("ARMSTRONG NUMBER");
    else
    System.out.println("NOT AN ARMSTRONG NUMBER");
    }
}