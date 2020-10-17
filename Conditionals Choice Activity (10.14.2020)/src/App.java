import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        subtraction();
    }
    public static void subtraction() {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            int x = rand(); 
            int y = rand();
            int larger = x > y ? x : y;
            int smaller = x > y ? y : x;
            int res = larger - smaller;
            System.out.println(larger + " - " + smaller + " = ? ");
            int input = s.nextInt();
            System.out.println(res == input ? "Correct. " + larger + " - " + smaller + " = " + res : "Incorrect. " + larger + " - " + smaller + " = " + res);
            i++;
        }
    }
    public static void perfectsquare(int num) {
        double x = Math.sqrt(num);
        double y = Math.floor(x);
        System.out.println(x == y ? "The number is a perfect square" : "The number is not a perfect square");
    }
    public static int rand() {
        return (int) (Math.random() * 10);
    }
}
