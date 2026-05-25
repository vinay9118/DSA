import java.util.*;

public class SubSequence{
    public static void subsequence(String str,int i,String newStr,HashSet<String> set){
        if(i== str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                 System.out.println(newStr);
                 set.add(newStr);
                 return;
            }

        }
        char ch=str.charAt(i);
        // to be a part
        subsequence(str,i+1,newStr+ch,set);
        //or not to be 
        subsequence(str,i+1,newStr,set);
    }
    //Keypad String
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombo(String str,int i,String combination){
        if(i == str.length()){
            System.out.println(combination);
            return;
        }
        char currch=str.charAt(i);
        String mapping=keypad[currch -'0'];

        for(int id=0; id<mapping.length();id++){
            printcombo(str,i+1,combination+mapping.charAt(id));
        }
    }
    public static void main(String[] args){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subsequence(str,0,"",set);
        //print keypad
        String str1="23";
        printcombo(str1,0,"");
    }
}