import java.io.*;
class angle
{
    public void main(int angle1, int angle2, int angle3)
    {
    boolean result;
    if (angle1 + angle2 + angle3 ==180)
    result= true;
    else
    result=false;
    
    {
        if (result==true)
        {
            if (angle1>90||angle2>90||angle3>90)
            System.out.println("OBTUSE TRIANGLE");
            else if(angle1<90&&angle2<90&&angle3<90)
            System.out.println("ACUTE TRIANGLE");
            else if(angle1==90||angle2==90||angle3==90)
            System.out.println("RIGHT ANGLED TRIANGLE");
        }
        else
        System.out.println("ANGLES DO NOT FORM A TRIANGLE");
    }}
}        
    
