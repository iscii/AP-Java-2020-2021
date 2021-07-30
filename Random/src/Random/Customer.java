//customer
public class Customer {
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n) {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public void amtDue(double amt) {
        System.out.println(name + ", account number " + currAccNum + ", please pay $" + amt);
    }

    public static int getNextAccNum() {
        return nextAccNum;
    }

    public void updateName(String n) {
        name = n;
    }

    public void hi() {
        this.updateName("hi");
    }
}