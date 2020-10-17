import java.util.Scanner;

/**
 * A class for running and testing Die All three constructors will be tested.
 * Create a Die using each of the constructors. print the value for a roll for
 * each of the Die.
 */
public class Main {
    public static void main(String[] args) {
        /* Runner code goes here */
        Die d1 = new Die();
        Die d2 = new Die(4);
        Die d3 = new Die(4, 3);

        Scanner x = new Scanner(System.in);
        int w;
        do {
            System.out.println("[1] to roll [0] to exit");
            w = x.nextInt();
            if(w == 1) {
                System.out.println("[1] "+d1.roll()+"\n[2] "+d2.roll()+"\n[3] "+d3.roll());
            }
        } while (w != 0);
        System.out.println("Exited");
        x.close();
    }
}