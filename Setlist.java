import java.util.*;

public class Setlist {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        //unique values and sorted order : Ordered list

        set.add(90);
        set.add(87);
        set.add(87);
        set.add(87);

        System.out.println("Set size: " +set.size());
        System.out.println("Remove index at 3: " +set.remove(87));
        System.out.println("Conatins element in list: " +set.contains(90));
        System.out.println("Checks list empty or not: " +set.isEmpty());

        set.clear();
        System.out.println("After clearing list: " +"\n"+ set);
    }
}
