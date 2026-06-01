import java.io.*;
class S1
{
    public static void main()
    {
        //STRING INITIALISATION
        String s1 = "Gayathri DP";
        String s2 = "Prakash K";
        String s3 = "Srinidhi P";
        String s4 = "WE ARE A FAMILY";
        
        //STRING FUNCTIONS
        System.out.println("STRING FUNCTIONS");
        System.out.println("String s1 = Gayathri DP");
        System.out.println("String s2 = Prakash K");
        System.out.println("String s3 = Srinidhi P");
        System.out.println("String s4 = WE ARE A FAMILY");
        System.out.println("  ");
        System.out.println("The length of s4 : " + s4.length());
        System.out.println("The 4th character is to be extracted from string s1 : " + s1.charAt(4));
        System.out.println("On applying the concatenate function on s1 and s2, we get " + s1.concat(s2));
        System.out.println("Conversion of string s4 to lowercase : " + s4.toLowerCase());
        System.out.println("Conversion of string s3 to uppercase : " + s3.toUpperCase());
        System.out.println("Using trim feature on s4 to neglect any blank spaces : " + s4.trim());
        System.out.println("Using replace feature to change words in s4. Notice the changes before and after");
        System.out.println("Before " + s4);
        s4=s4.replace("WE ARE A FAMILY","OURS IS A FAMILY");
        System.out.println("After " + s4);
        System.out.println("Using replace feature to change words in s3. Notice the changes before and after");
        System.out.println("Before " + s3);
        s3=s3.replace("Srinidhi P","SINDI");
        System.out.println("After " + s3);
        System.out.println("Using indexOf function on s3 to check the occurence of alphabet i from the begenning : " + s3.indexOf('i'));
        System.out.println("Using lastIndexOf function on s3 to check the occurence of alphabet i from the end : " + s3.lastIndexOf('i'));
        s4=s4.substring(0,3);
        System.out.println("Using substring function on string s4 to extract some words and display it : " + s4);
        System.out.println("");
        
        //BOOLEAN FUNCTIONS 
        System.out.println("BOOLEAN FUNCTIONS");
        System.out.println("Using equals function to check if 2 strings are equal " + s1.equals(s3));
        System.out.println("Using equalsIgnoreCase function to check if 2 strings, s1 and s3 are equal, irrespective of their case" + s1.equalsIgnoreCase(s3));
        System.out.println("To check if the string s2 ends with the letter K " + s2.endsWith("K"));
        System.out.println("To check if the string s2 starts with the letter P " + s2.startsWith("P"));
        System.out.println("To compare if the 2 strings, s1 and s3 are equal alphabetically " + s1.compareTo(s3));
    }
}