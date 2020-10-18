import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Stack{
    //attributes
    final String name = "Stack";
    private String username;
    private int userage;

    //constructors
    public Stack() {
        username = "Bob";
        userage = 16;
    }
    public Stack(int a) {
        username = "Bob";
        userage = a;
    }
    public Stack(String n) {
        username = n;
        userage = 16;
    }
    public Stack(int a, String n) {
        username = n;
        userage = a;
    }

    //methods
        //games
    public void run() {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println(this.toString());
        do {
            System.out.println("----------------------------------\n[1] Flip a boolean coin\n[2] Roll a die\n[3] Guess my number\n[4] Four function calculator\n[5] Get largest or smallest value in list\n[0] Power me off\n----------------------------------");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    coin();
                break;
                case 2:
                    die();
                break;
                case 3:
                    guessgame(s);
                break;
                case 4:
                    calc(s);
                break;
                case 5:
                    getlargestandsmallest(s);
                break;
            }
        } while (choice != 0);
        System.out.println("Powering off");
        s.close();
    }
        //games
    public void coin() {
        boolean bool = rand() == rand();
        System.out.println(bool);
    }
    public void die() {
        System.out.println(rand(1, 6));
    }
    public void guessgame(Scanner s) {
        //maybe turn it into a hot/cold game with 4 tries (binary search)
        int input;
        int num;

        System.out.println("Guess my number! It's between 1 and 10");
        num = rand(1, 10);
        input = s.nextInt();
        if(input == num)
            System.out.println("Correct! My number was " + num);
        else
            System.out.println("Incorrect. My number was " + num);
    }
    public void calc(Scanner s) {
        String[] nums = new String[2];
        int[] intnums = new int[2];
        DecimalFormat df = new DecimalFormat("0.00");
        double res = 0.0;
        String op = null;

        System.out.println("Format: <int><operator><int> (ex: 5*2)");
        String input = s.next();
        for(int i = 0; i < input.length(); i++){
            if(input.substring(i, i+1).equals("/") || input.substring(i, i+1).equals("*") || input.substring(i, i+1).equals("+") || input.substring(i, i+1).equals("-")) 
                op = input.substring(i, i+1);
        }

        try {
            if(op == null) throw new Exception("hi, this is a filler exception to get to the catch block");
            nums = input.split("\\"+op); //+ and * must be escaped since they are used in regex
        }
        catch (Exception e) {
            System.out.println("The operator was invalid");
            return;
        }
        try {
            intnums[0] = Integer.parseInt(nums[0]);
            intnums[1] = Integer.parseInt(nums[1]);
        }
        catch (Exception e) {
            //accounts for both overflow and non-number characters
            System.out.println("The numbers are invalid");
            return;
        }

        if(op.equals("/")) res = Double.parseDouble(df.format((double)intnums[0]/(double)intnums[1]));
        if(op.equals("*")) res = intnums[0]*intnums[1];
        if(op.equals("+")) res = intnums[0]+intnums[1];
        if(op.equals("-")) res = intnums[0]-intnums[1];
        System.out.println(intnums[0] + op + intnums[1] + "=" + res);
    }
    public void getlargestandsmallest(Scanner s) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        String input;
        int i = 1;
        System.out.println("Input your number and hit enter. [e] to submit.");
        do {
            System.out.print(i + ": ");
            input = s.next();
            if(input.matches("\\d+")){
                arr.add(Integer.parseInt(input));
                i++;
            }
        } while (!input.equals("e"));

        for(int j = 0; j < arr.size(); j++) {
            if(arr.get(j) < smallest)
                smallest = arr.get(j);
            if(arr.get(j) > largest)
                largest = arr.get(j);
        }
        System.out.println("Array: " + arr.toString());
        System.out.println("Largest number: [" + largest + "]");
        System.out.println("Smallest number: [" + smallest + "]");
    }

        //utility
    private int rand(int l, int u) {
        //return a random number between l, inclusive, and u, exclusive
        return (int) (Math.random() * u + l);
    }
    private int rand() {
        return (int) Math.round(Math.random());
    }
    public String toString() {
        return "Hello "+ username + " of " + userage + " years. My name is " + name + " and I am here to provide random entertainment.";
    }
}