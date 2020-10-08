public class BankAccount {
    private String name;
    private String password;
    private double balance;

    // Empty Constructor Sets password to null and balance to 0.0;
    public BankAccount() {
        name = null;
        password = null;
        balance = 0.0;
    }
    // Two parameter constructor sets password and balance
    public BankAccount(String nm, String pw, double bal) {
        name = nm;
        password = pw;;
        balance = bal;
    }

    // deposit adds money to the balance
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    // withdrawal subtracts from the balance
    public void withdrawal(double depositAmount) {
        balance -= depositAmount;
    }

    public void setName(String nm) {
        name = nm;
    }

    // print Name and balance
    public void printAccountInfo() {
        System.out.println("Name [" + name + "]\nBalance [" + balance + "]");
        System.out.println(password);
    }

    // make a toString method instead
    public String toString() {
        return "Name [" + name + "]\nBalance [" + balance + "]";
    }
}