
class Wrapper {

    static String[] str = {"100", "30", "20"};
    static int result=0;

    public static void main(String[] args) {

       // Boolean bool = (j.equals(i)) ? true : false; //object comparision

       for (String str1: str) {
           System.out.println(str1);
       }

        for (int i=0; i<str.length; i++) {
            int value = Integer.parseInt(str[i]); //type parsing
            result = result + value;
        }

        System.out.println(result);
    }
}
