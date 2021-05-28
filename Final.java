

class Test {
    final void func() {
        System.out.println("World!");
    }
}

public class Final extends Test {

    final static double PI = 3.14159;
    final static double TIME_OUT = 3.0;
    double x;

    public static void main(String[] args) {
        
        //PI = 3.90; //cannot change the value
        
       Final f = new Final(PI); // final variable as a parameter
       System.out.println(f.x);

       f.func();
    }

    Final(double pi) {
        x = pi; //interchange
      //  x = 9.0; //changing the value of non-final
    } 

    // void func() {
    //     System.out.println("Hello");
    // } //error - can't override a final method
}
