public class PolymorphismDemo{
    public static void main(String[] args){
        A cal=new A ();
        System.out.println(cal.calculate(20,30));
        System.out.println(cal.calculate((float)20.5,(float)30.6));

        Deer d=new Deer();
        d.eat();

    }
}
//fumnction overloading 
class A{
    int calculate(int a,int b){
        return a+b;
    }
    float calculate(float a,float b){
        return a+b;
    }

}
//method overriding -->parent and derived class have same method and parameter
//DERIVED CLASS ALWAYS ACCEPT THE ITS OWN METHOD 
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eat anything");
    }
    
}