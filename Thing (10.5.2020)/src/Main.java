import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Thing snack = new Thing("potato chip");

        snack.printMessage();
        run(snack);
    }

    public static void run(Thing snack) {
        Scanner cIn = new Scanner(System.in);
        int num;
        do {
            System.out.println("[1] to remove a random letter [0] to exit");
            num = cIn.nextInt();
            if (num == 1) {
                snack.removeRandLetter();
                snack.printMessage();
            }
        } while (num != 0);
        cIn.close();
    }
}