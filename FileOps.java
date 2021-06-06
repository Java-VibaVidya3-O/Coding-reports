import java.io.*;

public class FileOps {
    public static void main(String[] args) throws IOException {
        
        BufferedInputStream buffInput = new BufferedInputStream(System.in);
        byte[] data = new byte[500];
        System.out.println("Enter info: ");
        
        buffInput.read(data);

        FileOutputStream outputStream = new FileOutputStream("E:/MyInfo.txt");
        BufferedOutputStream buffOutput = new BufferedOutputStream(outputStream);

        buffOutput.write(data);
        buffOutput.flush();
        buffOutput.close();

        System.out.println("Info written!");

        BufferedReader buffReader = new BufferedReader(
            new InputStreamReader(new FileInputStream("E:/MyInfo.txt"))
        );

        String str = buffReader.readLine();

        String strSplit[] = str.split(" ");

        int sum=0;

        for (int i=0; i<strSplit.length; i++) {
            sum = sum + Integer.parseInt(strSplit[i]);
        }

        System.out.println(sum);

        buffReader.close();

        
    }
}
