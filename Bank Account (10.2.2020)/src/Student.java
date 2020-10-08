public class Student {

    private String name;
    private String email;

    // Add a constructor with no parameters to initialize both name and email to
    // "missing"
    public Student() {
        name = "missing";
        email = "missing";
    }

    // The constructor for creating a Student object with the name and email as
    // parameters
    public Student(String initName, String initEmail) {
        name = initName;
        email = initEmail;
    }

    // You might need to set the name.
    public void setName(String newName) {
        name = newName;
    }

    // Write a method to set the email
    public void setEmail(String e) {
        email = e;
    }

    // This will print all the info we need about the student
    public void print() {
        System.out.println(name + ":" + email);
    }

    // Challenge - add the toString version of print()
    // toString() is a default method and is always called to the object in sysout. Default returns the object's memory location
    public String toString() {
        return name + ": " + email;
    }
}