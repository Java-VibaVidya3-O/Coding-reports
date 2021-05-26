import java.util.Scanner;

public class Calsy {
    public static void main(String[] args) {
        
        System.out.println("Welcome, I am Calsy");

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = s.nextInt(); //input

        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();

        System.out.println("0. Exit" +"\n"+ "1. Addition" +"\n"+ "2. Subtraction" +"\n"+
        "3. Multiplication" +"\n"+ "4. Division" +"\n"+ "5. Modulo" +"\n"+
        "6. Power" +"\n"+ "7. Square root/Cube root" +"\n"+ "8. Odd/Even" +"\n");

        System.out.println("Enter ur choice >>>");
        int sw = s.nextInt();

        switch(sw) {
            case 0:
                    System.exit(0);
                    break;
            case 1:
                    int add = addNum(a, b); //calling function
                    System.out.println("Addition: "+add);
                    break;
            case 2:
                    int sub = Math.subtractExact(a, b); //using Math class
                    System.out.println("Subtraction: "+sub);
                    break;
            case 3:
                    int mul = Math.multiplyExact(a, b);
                    System.out.println("Multiplication: "+mul);
                    break;
            case 4:
            double div = Math.floorDiv(a, b);
            System.out.println("Division: "+div);
            break;
            case 5:
            int mod = Math.floorMod(a, b);
            System.out.println("Modulo: "+mod);
            break;

            case 6:
            double power = Math.pow(a, b);
            System.out.println("Power: "+power);
            break;

            case 7:
            double sqa = Math.sqrt(a);
            double cub = Math.cbrt(b);
            System.out.println("Sq root of a: "+sqa +"Cube root of b: "+cub);
            break;

            case 8:
            // if (a % 2 == 0) {
            //     System.out.println("a is even");
            // } else {
            //     System.out.println("a is odd");
            // }

            String num1 = (a % 2 == 0) ? "a is even" : "a is odd";
            System.out.println(num1); //expression condition

            String num2 = (b % 2 == 0) ? "b is even" : "b is odd";
            System.out.println(num2); 
        }

        s.close();
    }

    static int addNum(int a, int b) {
        int add = Math.addExact(a, b);
        //System.out.println("Addition: "+add); //output
        return add;
    }
}
