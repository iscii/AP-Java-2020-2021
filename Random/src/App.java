public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.parseInt("9999999"));
    }
    public static int biggestInt(int a, int b, int c){
        if ((a >= b) && (a >= c))
            return a;
        else if (b >= a && b >= c)
            return b;
        else return c;
    }
}