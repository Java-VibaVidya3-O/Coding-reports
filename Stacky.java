import java.util.*;

public class Stacky {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.push(1);
        st.push(5);

        System.out.println(st);

        System.out.println("Capacity (default and increase by 10): " +st.capacity());
        System.out.println("Return peek value: "+st.peek());
        System.out.println("Adding element (10): "+st.add(10));
        System.out.println("Contains 10: "+st.contains(10));
        System.out.println("Index of 2: "+st.indexOf(2));
        System.out.println("Search element 5: "+st.search(5));
        System.out.println("Size: "+st.size());
        System.out.println("Element at index 0: "+st.elementAt(0));
        System.out.println("First element: "+st.firstElement());
        System.out.println("Get element at 1: "+st.get(1));
        System.out.println("Last element value: "+st.lastElement());
        System.out.println("Retrieve first element: "+st.pop());
        System.out.println("After clear: "+st);
        System.out.println("Checks empty: "+st.isEmpty());
        System.out.println("Update at 0: "+st.set(0, 25));
        System.out.println("Remove at 0: "+st.remove(1));

        st.clear();
        System.out.println("After clear: "+st);
    }
}
