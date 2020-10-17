public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(rand(1, 10));

    }
    private static int rand(int l, int u) {
        //return a random number between l, inclusive, and u, exclusive
        return (int) (Math.random() * u + l);
    }
    public static int biggestInt(int a, int b, int c){
        if ((a >= b) && (a >= c))
            return a;
        else if (b >= a && b >= c)
            return b;
        else return c;
    }
}