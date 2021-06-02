public class Threadie implements Runnable {

    static int amount=0;

    public static void main(String[] args) {

        Threadie t = new Threadie(); //main class

        Thread thread = new Thread(t);

        thread.start();

        for(int i=0; i<3; i++) {
            System.out.println("Outside of thread" +i);
        }
    }

    public void run() {
        for(int i=0; i<3; i++) {
            System.out.println("Inside of thread" +i);
        }
    }
}
