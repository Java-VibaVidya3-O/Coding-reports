
class TestEncaps {
    private String name;
    private int rollNo;   //encapsulated data

    //getters and setters
    
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
        
        //e.name    //can't get private variable
        
        System.out.println(e.getName());
        System.out.println(e.getRollNo());
    }

}
