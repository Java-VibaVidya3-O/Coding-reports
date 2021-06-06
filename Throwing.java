import java.io.*;
import java.util.Scanner;

public class Throwing  {
    public static void main(String[] args) throws 
                            InterruptedException, IOException { //throws keyword to avoid compiletime-exception

        Scanner sc = new Scanner(System.in);
        int weigh = sc.nextInt();

        countWeigh(weigh);    //throw works on runtime-exception

        Thread.sleep(1000);     //throws works on compile-time

        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(new FileInputStream("E:/MyInfo.txt")));    //throws IOException

        divideByZero(weigh);    

        sc.close();
    }

    static void countWeigh(int weight) {
        if (weight < 50) throw new ArithmeticException("Not eligible to donate blood!");
        else System.out.println("Eligible to donate blood!");
    }

    static void divideByZero(int n) {
        try {
            System.out.println(n/0);
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
