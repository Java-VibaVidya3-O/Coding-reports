import java.util.LinkedList;
import java.util.Queue;

public class Queueie {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(10);
        q.add(5);
        q.add(15);

        System.out.println(q);

        System.out.println("Removes first value: "+q.remove());
        System.out.println("Offer 20 to return: "+q.offer(20));
        System.out.println("Returns peek value: "+q.peek());
        System.out.println("Retrieve first value: "+q.poll());
        System.out.println("Poll: "+q.remove(20));
        q.clear();
        System.out.println(q);
    }
}
