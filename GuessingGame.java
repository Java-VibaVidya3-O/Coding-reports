import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<Integer>(10); //Set of 10

        Scanner sc = new Scanner(System.in);

        int userNum=0;
        int count=3;

        Random rd;

        for (int i=0; i<10; i++) {
            rd = new Random(); //initialize object of Random
            int rdNum = rd.nextInt(20) +1; //get random number between 1-20

            set.add(rdNum);
        }

        for (int i=1; i<=3; i++) {
            
            userNum = sc.nextInt();

            if (set.contains(userNum)) {    //checking set contains value of input
                System.out.println("You won, the number is: " +userNum);
                break;
            }
            count--;
            System.out.println("Life: " +count);

            if (count==0) {
                System.out.println("You lost!");
            } 
        }

        System.out.println(set);

        sc.close();

    }
}
