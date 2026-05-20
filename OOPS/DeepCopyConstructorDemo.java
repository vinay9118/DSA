
public class DeepCopyConstructorDemo{
    public static void main(String [] args){
        Student s1=new Student();
        s1.name="veer";
        s1.room_no=17;
        s1.password="xyz";
        s1.marks[0]=10;
        s1.marks[1]=20;
        s1.marks[2]=30;
        for(int i=0;i<3;i++){
            System.out.println("Original marks-->>"+s1.marks[i]);
        }
        //DEEP CONSTRUCTER
        Student s2=new Student(s1);
        s2.password="XYZ";
        s1.marks[1]=100;    
        for(int i=0;i<3;i++){
            System.out.println("copied or update marks-->>"+s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int room_no;
    String password;
    int []marks;

    Student(){
        this.marks = new int[3];
    }

    Student(Student s1){
        this.name=s1.name;
        this.room_no=s1.room_no;
        marks = new int[3];
        for (int i = 0; i < marks.length;i++) {
        this.marks[i] = s1.marks[i];
               }

    }
}