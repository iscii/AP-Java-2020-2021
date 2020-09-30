import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Dog blub = new Dog("black", "plain", "Shiba", (short)125);
        Thread bio = new Thread(() -> {
            blub.breathe();
        });
        bio.start();
        
        Scanner aIn = new Scanner(System.in);
        byte guess;
        do {
            System.out.println("[1] Play [2] Sleep [3] Eat [4] Walk [0] Help");
            guess = aIn.nextByte();
            if(guess == 0) System.out.println("[1] Play [2] Sleep [3] Eat [4] Walk [0] Help");
            if(guess == 1) {
                System.out.println("Played");
                blub.play();
            }
            if(guess == 2) {
                System.out.println("Slept");
                blub.sleep();
            }
            if(guess == 3) {
                System.out.println("Eaten");
                blub.eat();
            }
            if(guess == 4) {
                System.out.println("Walked");
                blub.walk();
            } 
            blub.display();
        } while (blub.alive);
    }
}
