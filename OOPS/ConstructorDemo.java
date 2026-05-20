
//CONSTRUCTER -->> HAVE THE SAME NAME AS CLASS OR STRUCTURE,DON'T HAVE A RETURN TYPE(NOT EVEN VOID)
//CONSTRUCTER ARE ONLY CALLED AT ONCE,AT OBJECT CREATION
// TYPES OF CONSTRUCTOR NON-parameterized,Parameterized,copy Constructor

public class ConstructorDemo{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("VEER");
        Student s3=new Student("Aryaveer",567);
    }
}

class Student{
    String name;
    int room_no;
    Student(){
        System.out.println("Non-parametrized Constructer called...");
    }
    Student(String s){
        this.name=s;
        System.out.println("Parametrized Constructer called..."+name);
    }
     Student(String s,int n){
        this.name=s;
        this.room_no=n;
        System.out.println("Constructer called... Name ::"+name+"  Room No::"+room_no);
    }
}