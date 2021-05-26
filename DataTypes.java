class DataTypes {

  // 1. Primitive Data types :

  // a) Numeric
  // i. Integral
  //Integer:
    static int i = 10; //right to left in programming
    long l = 450580934;
    short s = 342;
    byte b = 23;
                                        
  //Floating-point: 
    static double d = 7.90;
    float f = 5.7f;


  // b) Character   
    char c = 'z';
  

  // c) Boolean
    boolean tr = true;
    boolean fl = false;  

                          //These all are instance variables

    public static void main(String[] args) {

    //   Test t = new Test(); //1st object Default Constructor
    //   t.func();

    //   Test test = new Test(); //2nd object
    //   test.func(); //calling function through object if not static

    func("ABC", 0); //calling function directly by making it static

    }

    //

    static void func(String a, int b) {
        // int a = 5; //local variable
        System.out.println(a +" "+b); //concatenation
    } //definition
}