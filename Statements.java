import java.util.*;

public class Statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Parameterized Constructor

          int a = sc.nextInt();

          //if-else

           if (a<=100 && a>=50) { 
               System.out.println("a is between than 99-50");
           } else if (a<50 && a>=25) {
               System.out.println("a is less than 50");
           } else if (a<25 || a>0) {
            System.out.println("a is less than 25");
           } else {
               System.out.println("greater than 100");
           }

        if (a<=100) {
            System.out.println("a less than 100");

            if(a<50) {
                System.out.println("a less than 50");

                if (a<25) {
                    System.out.println("a less than 25");
                }
            }
            else {
                System.out.println("a is between than 99-50");
            }
        }
        else {
            System.out.println("a greater than 100");
        }
     }    
}
