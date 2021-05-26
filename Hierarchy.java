

 class Parent {
     int length = 10;

     void parentFunc() {
        System.out.println("Parent class " +length);
    } 
 }

 class Child extends Parent {
    int width = 5;

     void childFunc() {
        System.out.println("Child class " +width);
    } 
 }

public class Hierarchy extends Parent {

    public static void main(String[] args) {
        Hierarchy h = new Hierarchy();
        h.length = 15;
        h.parentFunc();

        Child child = new Child();
        child.length = 5;
        child.parentFunc();
    }
}