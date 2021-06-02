import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        //Ordered group collection with repeating values

        list.add(90);
        list.add(87);
        list.add(45);
        list.add(87);

        System.out.println("Index value at 2: " +list.get(2));
        
        System.out.println("List size: " +list.size());
        System.out.println("Index of 45: " +list.indexOf(45));
        System.out.println("Remove index at 3: " +list.remove(3));
        System.out.println("Update index at 2: " +list.set(2, 54));
        System.out.println("Conatins element in list: " +list.contains(90));
        System.out.println("Checks list empty or not: " +list.isEmpty());
        System.out.println("Print sublist using indexes: " 
        +list.subList(1, 2));

        list.clear();
        System.out.println("After clearing list: " +"\n"+ list);

        
    }
}
