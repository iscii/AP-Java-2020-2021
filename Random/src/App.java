import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    final static String[] vows = { "a", "e", "i", "o", "u" };

    public static void main(String[] args) throws Exception {
        char[] a = new char[2];
        System.out.println(Arrays.toString(a));
    }

    public static int[] post4(int[] nums) {
        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(i);
            if (nums[i] == 4) {
                idx = i+1;
                break;
            }
        }
        int[] a = new int[nums.length - idx];
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[idx];
            idx++;
        }
        return a;
    }

    public static void arrayListAddRemove() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(8, 8, 4, 3, 3));
        // removes item on right side, add to left. slides everything else right.
        a.add(2, a.remove(4));
        System.out.println(a);
        a.add(1, a.remove(3));
        System.out.println(a);
        // removes item on left side, add to right. slides everything else left.
        a.add(4, a.remove(2));
        System.out.println(a);
        a.add(3, a.remove(1));
        System.out.println(a);
        // when using remove in add, it'll keep the array size and, at the index to add,
        // shift everything based on where you removed the element/the empty slot.
        // *So if you remove an element at an index higher than the new index you're
        // adding it to, it'll shift everything from that new index right.
        // *if you remove an element at an inedx lower than the new index you're adding
        // it to, it'll shift everything from that new index left.
    }

    public static void manipulate(List<String> animals) {
        /*
         * private static List<String> animals = new ArrayList<String>(
         * Arrays.asList("bear", "zebra", "bass", "cat", "koala", "baboon"));
         */
        for (int k = animals.size() - 1; k > 0; k--) {
            if (animals.get(k).substring(0, 1).equals("b")) {
                animals.add(animals.size() - k, animals.remove(k));
                System.out.println(animals);
            }
        }
    }

    public static void removeElement(ArrayList<Integer> data, int target) {
        /*
         * ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(8, 8, 4, 3, 3,
         * 6)); removeElement(a, 3);
         */
        for (int j = 0; j < data.size(); j++) {
            if (data.get(j).equals(target)) {
                data.remove(j);
            }
        }
        System.out.println(data);
    }

    public static void insert(int val, ArrayList<Integer> numList) {
        int index = 0;
        while (val > numList.get(index)) {
            index++;
        }
        numList.add(index, val);
        System.out.println(numList);
    }

    public static ArrayList<String> removeVowelWords(ArrayList<String> arr) {
        ArrayList<String> n = new ArrayList<String>();
        loop1: for (String s : arr) {
            for (String c : vows)
                if (s.contains(c))
                    continue loop1;
            n.add(s);
        }
        return n;
    }

    public static String scrambleWord(String word) {
        if (word.length() < 2)
            return word;
        String a = "";
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i + 1).equals("A") && !word.substring(i + 1, i + 2).equals("A")) {
                a += word.substring(i + 1, i + 2) + "A";
                i++;
            } else {
                a += word.substring(i, i + 1);
                if (i == word.length() - 2)
                    a += word.substring(i + 1, i + 2);
            }
        }
        return a;
    }

    public static void scrambleOrRemove(List<String> wordList) {
        List<String> n = new ArrayList<String>();
        for (String s : wordList)
            if (s.substring(0, s.length() - 1).contains("A"))
                n.add(scrambleWord(s));
        System.out.println(n);
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