import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col]; //empty array but initialized

        // for (int i=0; i<arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // for (int i=0; i<n; i++) {
        //     System.out.println(arr[i]);
        // } //single dimensional
        
        for (int i=0; i<6; i++) {
            for (int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix = ");

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
