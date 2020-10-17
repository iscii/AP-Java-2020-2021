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

        TwoDice td1 = new TwoDice(d1, d2);
        TwoDice td2 = new TwoDice(d2, d3);
        TwoDice td3 = new TwoDice(d1, d3);

        Scanner x = new Scanner(System.in);
        int w;
        do {
            System.out.println("[1] to roll [0] to exit");
            w = x.nextInt();
            if(w == 1) {
                System.out.println("[1] "+td1.roll()+"\n[2] "+td2.roll()+"\n[3] "+td3.roll());
            }
        } while (w != 0);
        System.out.println("Exited");
        x.close();
    }
}