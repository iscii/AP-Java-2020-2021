public class myap {
    public static void random() {

    }

    //frog
    /*
    public boolean simulate() {
        int dist = 0;
        for(int i=0;i<maxHops;i++) {
            dist += hopDistance();
            if(dist >= goalDistance)
                return true;
            if(dist < 0)
                return false;
        }
        return false;
    }
    public double runSimulations(int num) {
        double count;
        for(int i=0;i<num;i++)
            if(simulate()) count++;
        return count/(double)num;
    }
    */


    //hailstone
    public static int hailstoneLength(int n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0)
                n = n/2;
            else
                n = n*3 + 1;
            count++;
        }
        return count;
    }
    public static boolean isLongSeq(int n) {
        return (hailstoneLength(n) > n);
    }
    public static double propLong(int n){
        double count = 0;
        for(int i=1;i<=n;i++){
            if(isLongSeq(i)) count++;
        }
        return count/(double)n;
    }

    //palindrome
    public static void palindromeChecker(String str) {
        System.out.println(str + (reverseString(removeSpaces(str)).equals(removeSpaces(str)) ? " is" : " is not")
                + " a palindrome");
    }
    public static String removeSpaces(String str) {
        String[] x = str.split(" ");
        String r = "";
        for (String s : x) {
            r += s;
        }
        return r;
    }
    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.substring(i, i + 1) + result;
        }
        return result;
    }
}
