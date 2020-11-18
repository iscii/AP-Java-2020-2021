import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        while (true) {
            int dec;
            int res;
            int rem;
            int decPow16 = 8;
            String hex = "";
            System.out.println("Enter a decimal or [0] to exit");
            dec = s.nextInt();
            if (dec == 0)
                break;
            rem = dec;
            // find greatest possible power
            for (int i = 2; i <= decPow16; i++) {
                //System.out.println(dec + " " + Math.pow(16, i) + " " + (dec - Math.pow(16, i)));
                if (dec - Math.pow(16, i) < 0) {
                    decPow16 = i - 1;
                    break;
                }
            }
            System.out.println("16^" + decPow16 + " = " + (int) Math.pow(16, decPow16));

            // do subtractions
            for (int i = decPow16; i > 0; i--) {
                res = rem / (int)Math.pow(16, i); //get the result of division
                rem = rem % (int)Math.pow(16, i); //get the remainder to be used for more division to find rest of digs
                //System.out.println("res " + res);
                //System.out.println("rem " + rem);
                hex += getHex(res);
            }
            hex += getHex(rem);
            System.out.println(hex);
        }
        s.close();  
    }
    public static String getHex(int n) {
        switch(n){
            case 10: return "A"; 
            case 11: return "B"; 
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            default: return Integer.toString(n);
        }
    }

    public static int findGreatestPowerofSixteenThatFitsInAnInteger() { // always returns 8; greatest power of 16 that fits into type integer
        long res;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            res = (long) Math.pow(16, i);
            System.out.println(res);
            if (res > Integer.MAX_VALUE)
                return i;
        }
        return 0;
    }
}
