//String are immutable

import java.util.*;

public class string{

    public static void length(String Name){
        System.out.println("length of string :"+Name.length());
    }

    public static void concate(String s1,String  s2){
        System.out.println("concatenate of string abc and xyz:"+s1+" "+s2);

    }

    public static void findindex(String s1){
        System.out.println("zero index of string :"+s1.charAt(0));

    }

    public static void print(String s1){
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }
        

    }

    public static void main(String[] args){
        char [] arr={'a','b','c'};
        String str1="abc";
        String str2=new String("xyz");

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");
       String name =sc.nextLine();
       System.out.println(name);

       //find length
       length(name);

       //concatenate
       concate(str1,str2);

       //use of charAt() function
       findindex(str1);

        //print string
        print(name);

        //compare string
        String s4="Ram";
        String s5="Ram";
        String s6=new String("Ram");
        if(s4 ==s5){
            System.out.println(" s4 and s5 String Equal");
        }
        else{
             System.out.println("s4 and s5 String Not Equal");
        }
         if(s6 ==s5){
            System.out.println("s5 and s6 String Equal");
        }
        else{
             System.out.println("s5 and s6 String Not Equal");
        }
        
        //compare string and using new string==>.equals
        if(s5.equals(s6)){
            System.out.println("s5 and s6 String Equal");
        }
        else{
             System.out.println("s5 and s6 String Not Equal");
        }
    }
}