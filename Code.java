import java.util.Arrays;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int result=0;

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            result = result + arr[i];
        }

        arr[arr.length-1] = result;

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
