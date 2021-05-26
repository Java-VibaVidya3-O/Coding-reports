
interface Base1 {
    void baseFunc();
}

interface Subclass {
    void subclassFunc();
}

class Child1 implements Base1, Subclass {

    public void baseFunc() {
        System.out.println("Base1 class");
    }

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
