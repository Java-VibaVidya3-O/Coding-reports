
public class BufferString {
    public static void main(String[] args) {

        String str = "HelloWorld !";

        StringBuffer sbufBuffer = new StringBuffer(str);

        System.out.println("String methods: ");
        System.out.println(("String length: " +str.length()));
        System.out.println(("Substring: " +str.substring(5, 10)));
        System.out.println(("Substring by begin index: " +str.substring(5)));
        System.out.println(("Index of l: " +str.indexOf("l")));
        System.out.println(("Last indexof l: " +str.lastIndexOf("l")));
        System.out.println(("Character at index 5: " +str.charAt(5)));
        System.out.println(("Index of W: " +" + "+ str.concat("concat")));
        System.out.println(("Indent of 1: " +str.indent(1)));
        System.out.println(("Intern string: " +str.intern()));
        System.out.println(("Replace space: " +str.replace(" ", "")));
        System.out.println(("Lowercase: " +str.toLowerCase()));
        System.out.println(("Uppercase: " +str.toUpperCase()));
        System.out.println(("Equals: " +str.equals("helloworld !")));
        System.out.println(("EqualsIgnoreCase: " +str.equalsIgnoreCase("helloworld !")));
        System.out.println(("Maching string: " +str.matches("HelloWorld !")));
        System.out.println(("Subsequence: " +str.subSequence(5, str.length())));
        str = " ";
        System.out.println(("Substring by begin index: " +str.isBlank()));
        System.out.println(("Substring by begin index: " +str.isEmpty()));

        System.out.println();

        System.out.println("String Buffer methods: ");
        System.out.println(("Append string: " +sbufBuffer.append(" This is me")));
        System.out.println(("Capacity: " +sbufBuffer.capacity()));
        System.out.println(("Delete: " +sbufBuffer.delete(12, sbufBuffer.length())));
        System.out.println(("Reverse: " +sbufBuffer.reverse()));
    }
}
