
public class Constructor {
    int height; //created

    public Constructor() {
        height = 10; //initialize
}

    public Constructor(int i) {
        height = i;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(); //default constructor
        Constructor con = new Constructor(15); //parameterized constructor

        System.out.println("From Default Constructor = "+c.height);
        System.out.println("From Parameterized Constructor = "+con.height);
        
    }
   
}
