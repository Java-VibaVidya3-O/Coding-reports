import java.util.*;

class Wrapper extends Thread {

    static String[] str = {"100", "30", "20"};
    static int result=0;
    static int amount=1;

    public static void main(String[] args) {

       // Boolean bool = (j.equals(i)) ? true : false; //object comparision

    //    for (String str1: str) {
    //        System.out.println(str1);
    //    }

    //     for (int i=0; i<str.length; i++) {
    //         int value = Integer.parseInt(str[i]); //type parsing
    //         result = result + value;
    //     }

    //     System.out.println(result);

    Wrapper thread = new Wrapper();
    thread .start();

    while(thread.isAlive()) {
        System.out.println("Waiting...");
    }

  System.out.println("Main: " + amount);
  System.out.println("Main: " + amount);
}

  public void run() {
    amount++;
  }
}

