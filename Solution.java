import java.util.ArrayList;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> newDate = new ArrayList<>();

        List<Integer> oldDate = new ArrayList<>();

        for (int i=0; i<3; i++) {
            int n = sc.nextInt();
            newDate.add(n);
        }

        for (int i=0; i<3; i++) {
            int n = sc.nextInt();
            oldDate.add(n);
        }

        int diff=0;
        if (newDate.get(2).equals(oldDate.get(2))) {
            diff = Math.abs(newDate.get(0) - oldDate.get(0));
            
        }

        System.out.println(diff * 15);
       // System.out.println(newDate.get(2));

       sc.close();
    }
}
