import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Stack {
    String name;
    ArrayList<Animal> zooarr = new ArrayList<Animal>();

    // game
    public void run() {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println(this);
        // while bc infinite loop for scanner inputs until user chooses to exit.
        while (true) {
            System.out.println("--- [1] Arrays [2] Zoo [0] Exit ---");
            choice = s.nextInt();
            if (choice == 0)
                break;
            switch (choice) {
                case 1:
                    arrays(s);
                    break;
                case 2:
                    zoo(s);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        System.out.println("Goodnight...");
        s.close();
    }

    public void arrays(Scanner s) {
        int choice;

        System.out.println("Please enter your numbers (integers) separated by a space");
        s.nextLine();
        String[] temp = s.nextLine().split(" ");
        int[] arr = new int[temp.length];
        for (int i = 0; i < temp.length; i++)
            arr[i] = Integer.parseInt(temp[i]);
        loop1: while (true) {
            System.out.println(
                    "--- [1] Min/Max [2] Mode [3] Average [4] Sum [5] Dupes [6] Consecutive Pairs [7] Shift Left/Right [8] Reverse Order [0] Menu ---");
            choice = s.nextInt();

            switch (choice) {
                case 0:
                    break loop1;
                case 1:
                    System.out.println("Min: " + getMinMax(arr)[0] + " Max: " + getMinMax(arr)[1]);
                    break;
                case 2:
                    System.out.println("Mode: " + getMode(arr));
                    break;
                case 3:
                    System.out.println("Avg: " + getAvg(arr));
                    break;
                case 4:
                    System.out.println("Sum: " + getSum(arr));
                    break;
                case 5:
                    System.out.println("Dupes: " + getDupes(arr));
                    break;
                case 6:
                    System.out.println("Consecutive Pairs: " + Arrays.toString(getConsecs(arr)));
                    break;
                case 7:
                    boolean tlfr;
                    String in;
                    while (true) {
                        System.out.print("[L] Left, [R] Right: ");
                        in = s.next();
                        if (in.equals("L") || in.equals("l")) {
                            tlfr = true;
                            break;
                        }
                        if (in.equals("R") || in.equals("r")) {
                            tlfr = false;
                            break;
                        }
                        System.out.println("Invalid input");
                    }
                    System.out
                            .println("Shifted " + (tlfr ? "Left: " : "Right: ") + Arrays.toString(shiftLR(arr, tlfr)));
                    break;
                case 8:
                    System.out.println("Reversed: " + Arrays.toString(reverseOrder(arr)));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        System.out.println("Menu");
    }

    /**
     * Gets the min and max of array Precondition: arr.length > 0 Postcondition:
     * arr.length > 0
     * 
     * @param arr
     * @return int array [min, max]
     */
    public int[] getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        return new int[] { min, max };
    }

    public int getMode(int[] arr) {
        int mode = arr[0];
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(arr[0], 1);
        for (int i = 1; i < arr.length; i++) {
            if (m.get(arr[i]) == null)
                m.put(arr[i], 1);
            else
                m.put(arr[i], m.get(arr[i]) + 1);

            if (m.get(mode) < m.get(arr[i]))
                mode = arr[i];
        }
        return mode;
    }

    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public int getSum(int[] arr) {
        int s = 0;
        for (int i : arr)
            s += i;
        return s;
    }

    public static HashMap<Integer, Integer> getDupes(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i : arr)
            if (h.get(i) != null)
                h.put(i, h.get(i) + 1);
            else
                h.put(i, 1);
        HashMap<Integer, Integer> j = new HashMap<Integer, Integer>();
        for (HashMap.Entry<Integer, Integer> entry : h.entrySet())
            if (entry.getValue() > 1)
                j.put(entry.getKey(), entry.getValue());
        return j;
    }

    /**
     * Gets the consecutive pairs of array
     * 
     * @param arr
     * @return int array [indices of first item of consecutive pair]
     */
    public Integer[] getConsecs(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            if (i != arr.length - 1 && ((arr[i] + 1) == arr[i + 1]))
                a.add(i);
        return a.toArray(new Integer[a.size()]);
    }

    /**
     * Shifts the array left or right
     * 
     * @param arr
     * @param tlfr true: left, false: right
     * @return int array shifted
     */
    public int[] shiftLR(int[] arr, boolean tlfr) {
        int[] n = new int[arr.length];
        if (tlfr) {
            for (int i = 0; i < arr.length - 1; i++) {
                n[i] = arr[i + 1];
            }
            n[n.length - 1] = arr[0];
        } else {
            for (int i = 1; i < arr.length; i++) {
                n[i] = arr[i - 1];
            }
            n[0] = arr[arr.length - 1];
        }
        return n;
    }

    public Integer[] reverseOrder(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            a.add(arr[i]);
        }
        return a.toArray(new Integer[a.size()]);
    }

    public void zoo(Scanner s) {
        int choice;

        System.out.println("Welcome to the Stack Zoo!");
        printZoo();
        loop1: while (true) {
            System.out.println(
                    "--- [1] Add animal [2] Remove animal [3] Random animal [4] Edit animal [5] Search [0] Menu ---");
            choice = s.nextInt();
            if (zooarr.size() < 1 && choice > 1) {
                System.out.println("Add an animal first");
                continue;
            }
            switch (choice) {
                case 0:
                    break loop1;
                case 1:
                    addAnimal(s);
                    break;
                case 2:
                    removeAnimal(s);
                    break;
                case 3:
                    randomAnimal();
                    break;
                case 4:
                    editAnimal(s);
                    break;
                case 5:
                    searchAnimal(s);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            printZoo();
        }
        System.out.println("Menu");
    }

    public void printZoo() {
        if (zooarr.size() > 0) {
            System.out.print("Animals: ");
            for (Animal a : zooarr)
                System.out.print(a + " ");
            System.out.print("\n");
        } else
            System.out.println("Your zoo is empty");
    }

    public void addAnimal(Scanner s) {
        String n;
        int t;
        String[] p;

        System.out.println("Enter its name: ");
        s.nextLine();
        n = s.nextLine();
        while (true) {
            System.out.println("Enter its type: ");
            System.out
                    .println("\tTypes: [0] dog [1] cat [2] bunny [3] giraffe [4] monke [5] lion [6] tiger [7] penguin");
            t = s.nextInt();
            if (t < 0 || t > 7)
                System.out.println("Invalid input");
            else
                break;
        }
        System.out.println("Enter its properties separated by a space: ");
        s.nextLine();
        p = s.nextLine().split(" ");
        zooarr.add(new Animal(n, t, p));
    }

    public void removeAnimal(Scanner s) {
        int id;
        while (true) {
            System.out.println("Enter id of animal: ");
            id = s.nextInt();
            for(Animal a: zooarr){
                if(a.getID() == id){
                    System.out.println(a.getName() + " removed");
                    zooarr.remove(zooarr.indexOf(a));
                    return;
                }
            }
            System.out.println("There is no such animal");
        }
    }

    public void randomAnimal() {
        int r = rand(0, zooarr.size());
        System.out.println("Random animal: index [" + r + "]: " + zooarr.get(r));
    }

    public void editAnimal(Scanner s) {
        int i;
        int id;
        loop1: while (true) {
            System.out.println("[1] Name [2] Type [3] Class ID [0] Back");
            i = s.nextInt();
            loop2:
            switch (i) {
                case 0:
                    break loop1;
                case 1, 2:
                    System.out.println("Enter id of animal: ");
                    id = s.nextInt();
                    for (Animal a : zooarr){
                        if (a.getID() == id) {
                            if (i == 1) {
                                System.out.println("Enter new name: ");
                                s.nextLine();
                                String n = s.nextLine();
                                a.setName(n);
                                System.out.println("Name set to " + n);
                            } else {
                                System.out.println("Enter new type: ");
                                System.out.println(
                                        "\tTypes: [0] dog [1] cat [2] bunny [3] giraffe [4] monke [5] lion [6] tiger [7] penguin");
                                int t = s.nextInt();
                                if (t < 0 || t > 7){
                                    System.out.println("Invalid input");
                                    break;
                                }
                                a.setType(t);
                                System.out.println("Type set");
                            }
                            break loop2;
                        }
                    }
                    System.out.println("There is no such animal");
                    break;
                case 3:
                    System.out.println(
                            "Input new starting ID (must be greater than current ID [" + Animal.getNextID() + "]): ");
                    int a = s.nextInt();
                    if (a >= Animal.getNextID()) {
                        Animal.setID(a);
                        System.out.println("Animal starting ID set to " + a);
                    } else {
                        System.out.println("Invalid ID");
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public void searchAnimal(Scanner s) {
        int i;
        String p;
        // int j;
        while (true) {
            System.out.println(
                    "Search: [1] One animal with a property [2] All animals have a property [3] Num animals with a property [0] Back");
            i = s.nextInt();
            if (i == 0)
                break;
            if (i > 3) {
                System.out.println("Invalid input");
                continue;
            }
            System.out.println("What property?");
            s.nextLine();
            p = s.nextLine();
            /*
             * while (true) { System.out.println("[1] Type [2] Property [3] Both [0] Back");
             * j = s.nextInt(); if (j == 0) break; if (j > 3)
             * System.out.println("Invalid input"); }
             */
            switch (i) {
                case 1:
                    System.out.println(oneEl(p));
                    break;
                case 2:
                    String str = allEl(p) ? "All animals have this property" : "Not all animals have this property";
                    System.out.println(str);
                    break;
                case 3:
                    System.out.println("There are " + numEl(p) + " animals with that property");
                    break;
            }
        }
    }

    String oneEl(String p) {
        for (Animal a : zooarr)
            for (String prop : a.getProperties())
                if (prop.equals(p))
                    return a.toString();
        return "There is no animal with that property";
    }

    boolean allEl(String p) {
        boolean f = false;
        for (Animal a : zooarr) {
            for (String prop : a.getProperties())
                if (prop.equals(p))
                    return f = true;
            if (!f)
                return false;
            f = false;
        }
        return true;
    }

    int numEl(String p) {
        int c = 0;
        for (Animal a : zooarr)
            for (String prop : a.getProperties())
                if (prop.equals(p)) {
                    c++;
                    break;
                }
        return c;
    }

    // utility
    /**
     * return a random number between l, inclusive, and u, exclusive
     * 
     * @param l lower bound
     * @param u upper bound
     */
    private int rand(int l, int u) {
        return (int) (Math.random() * u + l);
    }

    public String toString() {
        return "Good morning. I'm Stack, and I am here to provide random entertainment.";
    }
}
