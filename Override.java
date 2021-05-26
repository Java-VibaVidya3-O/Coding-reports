

class Dog {
    void eat() { 
        System.out.println("Dog is eating...");
    }
}

class Cat extends Dog {

    void eat() { 
        System.out.println("Cat is eating...");
    } //overriden
}

public class Override extends Cat {
    public static void main(String[] args) {
        Override override = new Override();
        override.eat();
    }
}
