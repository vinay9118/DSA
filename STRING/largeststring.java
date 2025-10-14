import java.util.*;
//largest string using LEXICOGRAPHIC
//STRING.compareTo(another string);
public class largeststring{
    public static String  Largeststring(String str[]){

        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
       return largest;
    }
    public static void main(String [] args){
        String str1[]={"apple","mango","banana"};
        String result=Largeststring(str1);
        System.out.println(result);
    }
}