import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Hello World!");
        } else if (n % 3 == 0) {
            System.out.println("Hello ");
        } 
        else if (n % 5 == 0) {
            System.out.println("World!");
        }
        else {
            System.out.println("No divisibility");
        }

        sc.close();
    }
}
