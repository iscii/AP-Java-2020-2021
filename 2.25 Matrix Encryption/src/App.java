import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Scanner s = new Scanner(System.in);
         * System.out.println("Input your string: "); 
         * String str = s.nextLine();
         */

        String test = encrypt("Java is fun!");
        System.out.println(test);
        System.out.println(decrypt(test));
        String a = encrypt("123456789");
        System.out.println(a);
        System.out.println(decrypt(a));
        String b = encrypt("1234567890");
        System.out.println(b);
        System.out.println(decrypt(b));
        String c = encrypt("12345678");
        System.out.println(c);
        System.out.println(decrypt(c));

    }

    public static String encrypt(String str) {
        int n = str.length();
        int r = (int) Math.floor(Math.sqrt(n));
        int c = (int) Math.ceil((Math.sqrt(n)));
        r = r * c < n ? r + 1 : r;

        int k = 0;
        String[][] matrix = new String[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k < str.length() ? str.substring(k, k + 1) : "";
                k++;
            }
        }

        String res = "";
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res += matrix[j][i];
            }
        }

        return res;
    }

    public static String decrypt(String str) {
        int n = str.length();
        int r = (int) Math.ceil(Math.sqrt(n));
        int c = (int) Math.floor((Math.sqrt(n)));
        r = r * c < n ? r + 1 : r;

        int k = 0;
        String[][] matrix = new String[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k < str.length() ? str.substring(k, k + 1) : "";
                k++;
            }
        }

        String res = "";
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res += matrix[j][i];
            }
        }
        return res;
    }
}
