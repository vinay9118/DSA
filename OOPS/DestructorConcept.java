
//Desconstructer are used to desconstruct the unused object
public class DestructorConcept{
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