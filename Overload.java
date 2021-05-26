

 class Square {
     
    void area(int s) {
        System.out.println(s*s);
    }
}

public class Overload {
    public static void main(String[] args) {
        int length = 5;
        int breadth = 10;

         System.out.println(area(length));
         System.out.println(area(length, breadth)); //overloaded
        
        Square overload = new Square();
        overload.area(length);

    }

    static int area(int s) {
        int arr = s*s;
        return arr;   
    }

    static int area(int l, int b) {
        int arr = l*b;
        return arr;   
    }
}
