
abstract class Abstraction {
    abstract void func(); //abstract methods

    void implementFunc() {
        System.out.println("Supports abstract methods as well as implemented"); //method definition
    }
}

public class Abstract extends Abstraction {

    void func() {
        System.out.println("Abstraction in java");
    }
        public static void main(String[] args) {
        Abstract t = new Abstract();
        t.func();
        t.implementFunc();
    }
    
}
