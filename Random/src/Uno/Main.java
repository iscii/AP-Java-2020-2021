import java.util.Scanner;
import java.util.ArrayList;

class Main {
    // two decks: draw and discard. maybe we can use the stack class for discard
    static int turn = 0;

    public static void main(String[] args) {
        System.out.println("");
        run();
    }

    public static void run() {
        Deck mainDeck = new Deck();
        mainDeck.shuffle();

        // deal cards
        Hand[] players = { new Hand(mainDeck), new Hand(mainDeck), new Hand(mainDeck) };
        int you = (int) (Math.random() * 3);

        // top card of maindeck to discardpile
        Card discard = mainDeck.pop();
        Scanner in = new Scanner(System.in);
        int index, amtAdd = 0;
        String newColor = discard.getColor();
        ArrayList<Card> yourHand = players[you].getHand();
        while (true) {
            System.out.println((turn == you ? "Your" : "Player " + turn + "'s") + " Turn");
            if (turn == you) {
                System.out.println("Discarded card: " + discard);
                for (int i = 0; i < 3; i++) {
                    if (i == you)
                        continue;
                    System.out.println("Player " + i + " card count: " + players[i].getSize());
                }
                System.out.println("Your hand: " + players[you].getSize() + yourHand);

                System.out.println("Pick an index: ");
                index = in.nextInt();
                if (index >= players[you].getSize())
                    continue;
                if (yourHand.get(index).getColor().equals(discard.getColor())
                        || yourHand.get(index).getType().equals(discard.getType())) {
                    if (yourHand.get(index).getType().equals("reverse")) {
                        discard = yourHand.remove(index);
                        nextTurn(-1);
                        continue;
                    } else if (yourHand.get(index).getType().equals("skip")) {
                        discard = yourHand.remove(index);
                        nextTurn(1);
                    } else if (yourHand.get(index).getType().equals("drawtwo")) {
                        amtAdd += 2; // remem to reset amtAdd when it gets there
                        discard = yourHand.remove(index);

                    } else {
                        discard = yourHand.remove(index);
                    }
                    System.out.println("You played " + discard);
                }
            } else {
                // CPU
                for (int i = 0; i < players[turn].getSize(); i++) {
                    // check numbers first
                    for (int j = 0; j <= 9; j++) {

                    }
                    // check colors
                }
            }
            System.out.println("--------------------------------");
            newColor = discard.getColor();
            nextTurn(1);
        }
    }

    public static void nextTurn(int mod) {
        turn += mod;
        if (turn < 0)
            turn = 2;
        if (turn > 2)
            turn = 0;
    }
}