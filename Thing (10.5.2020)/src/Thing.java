public class Thing {
    private String name;

    /** Constructs a new Thing named myName */
    public Thing(String myName) {
        name = myName;
    }

    /** Returns this Thing’s name */
    public String getName() {
        return name;
    }

    /** Sets this Thing’s name to newName */
    public void setName(String newName) {
        name = newName;
    }

    /** Part (c) sets name to name witha random letter removed **/
    public void removeRandLetter() {
        int randomLetter = (int)((Math.random()+0.1f) * (name.length() - 1));
        System.out.println(randomLetter);
        try {
            name = name.substring(0, randomLetter) + name.substring(randomLetter + 1);
        } catch (Exception e) {
            System.out.println("no more chars >:(");
        }
    }

    /** Returns a message as described in part (b) */
    public void printMessage() {
        System.out.println(name + " is great");
    }
}