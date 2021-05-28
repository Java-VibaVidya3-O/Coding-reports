public class Continue {
    public static void main(String[] args) {

        for (int i=1; i<=20; i++) {
            if (i>=11 && i<=15) continue;
            System.out.println(i);
        }
    }
}
