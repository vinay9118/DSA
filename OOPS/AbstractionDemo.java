import java.util.*;

public class AbstractionDemo {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        
        Chicken ch = new Chicken();
        ch.eat();
        ch.walk(); 
        
        System.out.println(h.color);
        
        Male m = new Male();
    }
}

abstract class Animal {
    String color;
    
    Animal() {
        color = "red";
        System.out.println("Animal constructor called...");
    }
    
    void eat() {
        System.out.println("eat");
    }
    
    abstract void walk();
}

class Horse extends Animal {
    @Override
    void walk() {
        System.out.println("walk on 4 legs");
    }
    
    Horse() {
        System.out.println("Horse constructor called ...");
    }
}

class Chicken extends Animal {
    @Override
    void walk() {
        System.out.println("walk on 2 legs");
    }
}

class Male extends Horse {
    Male() {
        System.out.println("Male constructor called....");
    }
}