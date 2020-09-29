import java.util.Scanner;

public class NumberGuess {
    private double theNumber;
    public NumberGuess() {
        theNumber = Math.floor(Math.random() * 10) + 1;
    }

    public void runGame() {
        System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");
        Scanner jIn = new Scanner(System.in);
        int guess;
        do {
            System.out.print("[Press 0 to exit] Guess: ");
            guess = jIn.nextInt();
        }
        while(guess != theNumber && guess != 0);
        
        String msg = (guess == theNumber) ? "You guessed it right!" : "Exited";
        System.out.println(msg);
        jIn.close();
    }
}
