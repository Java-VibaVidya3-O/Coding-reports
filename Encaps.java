
class TestEncaps {
    private String name;
    private int rollNo;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class Encaps {
    public static void main(String[] args) {
        TestEncaps e = new TestEncaps();

        e.setName("Sreeja");
        e.setRollNo(20);

        System.out.println(e.getName());
        System.out.println(e.getRollNo());
    }

}
