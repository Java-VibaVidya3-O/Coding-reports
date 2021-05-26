

class Parent {
    int height = 10; //property

    void parentFunc() {
        System.out.println("Parent class: " +height);
    } //definition
}

public class SingleInheritance extends Parent {
    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        s.height = 15;
        s.parentFunc(); //calling
    }
}