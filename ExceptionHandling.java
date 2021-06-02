

public class ExceptionHandling {
    public static void main(String[] args) {

        int[] n = new int[3];
        String str = null;

        try {
            System.out.println(5/0);    //Arithmetic 
            System.out.println(n[5]);   //ArrayIndexOutOfBound
            System.out.println(str);    //NullPointer
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        catch(Exception e) {                //Super class Exception class
            System.out.println(e);
        }
        finally {
            System.out.println("Print anything finally!");
        }
    }
}
