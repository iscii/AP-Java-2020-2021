public class Main {
    public static void main(String[] args) throws Exception {
        BankAccountRunner();
        StudentRunner();
    }
    public static void BankAccountRunner() {
        //Create four accounts 
        BankAccount ba1 = new BankAccount("Tru", "giggity123", 500);
        BankAccount ba2 = new BankAccount("Nar", "123456", 250);
        BankAccount ba3 = new BankAccount("Foo", "password", 600);
        BankAccount ba4 = new BankAccount("Bar", "securepassword", 900);
        //print out the account info for each customer
        ba1.printAccountInfo();
        ba2.printAccountInfo();
        ba3.printAccountInfo();
        ba4.printAccountInfo();
        //add to the balance of two of the customers
        ba1.deposit(200);
        ba2.deposit(420);
        //check their new balance
        ba1.printAccountInfo();
        ba2.printAccountInfo();
        //withdraw money from two of the accounts
        ba3.withdrawal(100);
        ba4.withdrawal(420);
        //check the new balance
        ba3.printAccountInfo();
        ba4.printAccountInfo();
        //update the name to a customer and check the new name.  
        ba1.setName("Gamer");
        ba1.printAccountInfo();
        //test out the toString() method
        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println(ba3);
        System.out.println(ba4);
    }
    public static void StudentRunner() {
        //Create four students (with fake emails) 
        Student s1 = new Student("Tru", "tru@gmail.com");
        Student s2 = new Student("Nar", "nar@gmail.com");
        Student s3 = new Student("Foo", "foo@gmail.com");
        Student s4 = new Student("Bar", "bar@gmail.com");
        //print out the student info for each student
        s1.print();
        s2.print();
        s3.print();
        s4.print();
        //change the of emails to their nycstudents.net email
        s1.setEmail("truz@nycstudents.net");
        s2.setEmail("narz@nycstudents.net");
        s3.setEmail("fooz@nycstudents.net");
        s4.setEmail("barz@nycstudents.net");
        //change the names so they have the format first name, last name
        s1.setName("Tru Za");
        s2.setName("Nar Za");
        s3.setName("Foo Za");
        s4.setName("Bar Za");

        //test out the toString() method
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
