import java.util.*;
//Abstract class create an instance of abstract class
public class Abstract{
    public static void main(String[] args){
        Horse h=new Horse();
        h.eat();
        h.walk();
        chicken ch=new chicken();
        ch.eat();
        ch.walk(); 
        System.out.println(h.color);
        male m=new male();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="red";
        System.out.println("Animal constructer called...");
    }
    void eat(){
        System.out.println("eat");
    }
    abstract void  walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walk on right side 4");
    }
    Horse(){
        System.out.println("Horse constructer called ...");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walk on left side 2");
    }
}
class male extends Horse{
    male(){
        System.out.println("male constructer called....");
    }
}