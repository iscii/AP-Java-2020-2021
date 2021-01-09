import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String a = "a";
        String c = "c";
        System.out.println(a==c);
    }

    public static void test2() {
        int[] arr = { 10, 20, 30, 40, 50 };
        for (int x = 1; x < arr.length - 1; x++) {
            arr[x + 1] = arr[x] + arr[x + 1];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int checkString(String[] arr) {
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length() >= 3) {
                count++;
            }
        }
        return count;
    }

    public static String[] arraylisttest() {
        ArrayList<String> t = new ArrayList<String>();
        t.add("hi");
        String[] s = { "hi" };
        System.out.println(s);
        return t.toArray(new String[t.size()]);
    }

    public static void xPrime() {
        Scanner s = new Scanner(System.in);
        int g;
        loop1: while (true) {
            System.out.print("[0] To Exit\nPrime? ");
            g = s.nextInt();
            if (g == 0)
                break;
            // if prime
            if (g == 1) {
                System.out.println("no");
                continue loop1;
            }
            if (g == 2) {
                System.out.println("yes");
                continue loop1;
            }
            for (int i = 2; i < g / 2; i++) {
                if (i != g && i % g != 1 && g % i == 0) {
                    System.out.println("no");
                    continue loop1;
                }
            }
            System.out.println("yes");
        }
        System.out.println("Exited");
        s.close();
    }

    public static void codingBat(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e"))
                count++;
        }
        System.out.println(count);
    }

    public static void albertio() {

    }

    public static void compareStrings() {
        System.out.println("torrac".compareTo("carrot"));
        System.out.println("xy".substring(0, 0) + "xy".substring(2));
    }

    public static void testLoops() {
        for (int i = 1; i < 1; i++) {
            System.out.println(i);
        }
    }

    final static String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public static void printNum(int value, int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            int num;
            do {
                num = (int) (Math.random() * 9);
                System.out.print(num);
            } while (num != value);
            System.out.println();
        }
    }

    public static void loopLetters(int chars, String pass) {
        for (int i = 0; i < abc.length; i++) {
            if (chars > 1)
                loopLetters(chars - 1, pass + abc[i]);
            else {

                System.out.println(pass + abc[i]);
            }
        }
    }

    public static void operatorPrecedence() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        if ((a && b) == (c && d))
            System.out.println("== First");
        else
            System.out.println("&& First");
    }

    public static int rand(int l, int u) {
        // return a random number between l, inclusive, and u, exclusive
        return (int) (Math.random() * u + l);
    }

    public static int biggestInt(int a, int b, int c) {
        if ((a >= b) && (a >= c))
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static boolean compareDouble(double a, double b, double tolerance) {
        if (Math.abs(a - b) <= tolerance)
            return true;
        return false;
    }
}