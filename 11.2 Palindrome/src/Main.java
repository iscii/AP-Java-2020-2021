import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Palindrome p = new Palindrome();
        int c;
        while(true) {
            System.out.println("[1] letter palindrome, [2] word palindrome [0] to exit");
            c = s.nextInt();
            if(c == 0) break;
            switch (c) {
                case 1: p.runLetter(s); break;
                case 2: p.runWord(s); break;
                default: System.out.println("That is not an option"); break;
            }
        }
        System.out.println("exited program");
        s.close();
    }
}
