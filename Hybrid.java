
interface Base1 {
    void baseFunc(); //declare functions / abstract method
}

interface Superclass {
    void subclassFunc();

    // void func(){

    // } //definition
}

abstract class Child1 implements Base1, Superclass {

    public void baseFunc() {
        System.out.println("Base1 class");
    } //function body/implementation

    public void subclassFunc() {
        System.out.println("Base2 class");
    }

    void childFunc() {
        System.out.println("Child class");
    }
}

public class Hybrid extends Child1 {

    public static void main(String[] args) {
        Hybrid hybrid = new Hybrid();

        hybrid.baseFunc();
        hybrid.subclassFunc();
        hybrid.childFunc();
    }
}
