import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sw = sc.nextInt();

        switch(sw) {
            case 1:
                    System.out.println("a is 1");
                    break;

            case 100:
                    System.out.println("a is 100");
                    break;

            case 150:
                    System.out.println("a is 150");
                    break;

            default:
                    System.out.println("a is "+sw);

        }
    }
}
