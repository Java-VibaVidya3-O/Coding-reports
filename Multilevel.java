


class Parent {
    int height = 10; //property

    void parentFunc() {
        System.out.println("Parent class " +height);
    } //define
}

class Base extends Parent {

    int weight = 5; //property

    void baseFunc() {
        System.out.println("Base class " +weight);
    } //define
}

public class Multilevel extends Base {
    public static void main(String[] args) {

        int width = 0;

        Multilevel lMultilevel = new Multilevel();

        // lMultilevel.weight= 10;
        // lMultilevel.baseFunc();

        // lMultilevel.height = 15;
        // lMultilevel.parentFunc();

        Base base = new Base();
        base.height = 25;
        base.parentFunc();

    
    }
}
