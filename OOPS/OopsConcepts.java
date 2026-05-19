import java.util.*;

// CONCEPT OF CLASS AND OBJECT
// ENCAPSULATION -->> WRAPPING UP OF DATA & METHODS(FUNCTION) UNDER A SINGLE UNIT.
public class OopsConcepts{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name); 
        System.out.println(s.calculate(10, 20, 30));

        // ACCESS MODIFIERS: DEFAULT, PUBLIC, PRIVATE, PROTECTED
        BankAccount bank = new BankAccount();
        bank.setPassword("MONEY TRANSFER");
        System.out.println(bank.getPassword());
    }
}

class Student {
    String name = "ramayan";
    String DOB;
    int marks;

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

class BankAccount {
    public String username;
    private String password;

    // Set or modify the password object
    public void setPassword(String pwd) {
         this.password = pwd;
    }

    // Get the password object
    String getPassword() {
        return this.password;
    }
}

// CONSTRUCTOR -->> HAS THE SAME NAME AS CLASS, DOES NOT HAVE A RETURN TYPE (NOT EVEN VOID)
// CONSTRUCTORS ARE CALLED ONLY ONCE, AT OBJECT CREATION
class Boys {
    String name;
    int room_no;

    Boys(String s) {
        name = s;
        System.out.println("Constructor called..." + name);
    }
}