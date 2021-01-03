public class Animal {
    final String[] types = { "dog", "cat", "bunny", "giraffe", "monke", "lion", "tiger", "penguin" };
    static int nextid = 1;
    String name;
    String type;
    String[] properties;
    int id;

    // object parameter constructor (String[])
    public Animal(String n, int t, String[] p) {
        name = n;
        type = types[t];
        properties = p;
        id = nextid;
        nextid += 1;
    }

    //accessors
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String[] getProperties() {
        return properties;
    }

    public int getID() {
        return id;
    }

    public static int getNextID() {
        return nextid;
    }

    //mutators
    public void setName(String n) {
        name = n;
    }
    public void setType(int t) {
        type = types[t];
    }
    public static void setID(int i) {
        nextid = i;
    }

    public String toString() {
        return name + "[TYPE:" + type + "][ID:" + id + "]";
    }
}
