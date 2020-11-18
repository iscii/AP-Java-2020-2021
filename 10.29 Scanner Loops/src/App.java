import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        perfect(s);
    }

    public static void perfect(Scanner s) {
        System.out.print("Enter your positive integer: ");
        int input = s.nextInt();
        int sum = 0;
        System.out.print("Proper divisors of " + input + ":");
        for (int i = 1; i < input; i++) {
            if(input%i==0) {
                System.out.print(" " + i);
                sum += i;
            }
        }
        System.out.println("\nSum of proper divisors: " + sum);
        if(sum == input)
            System.out.println(input + " is a perfect number");
        else
            System.out.println(input + " is not a perfect number");
    }

    public static void sentinel(Scanner s) {
        int total = 0;
        int input;
        do {
            System.out.print("Enter an integer or [0] to end input: ");
            input = s.nextInt();
            total += input;
        } while (input != 0);
        System.out.println("Your total is " + total);
    }

    public static void subtractionQuiz(Scanner s) {
        double start = System.currentTimeMillis();
        int ans;
        int res;
        int count = 1;
        int score = 0;

        System.out.println("Start!!");
        do {
            int n1 = rand(50, 1);
            int n2 = rand(50, 1);
            int l = n1 >= n2 ? n1 : n2;
            int sm = n2 >= n1 ? n1 : n2;
            res = l - sm;
            System.out.print(count + ") " + l + " - " + sm + " = ");
            ans = s.nextInt();
            if (ans == res) {
                System.out.println("y");
                score++;
            } else {
                System.out.println("x");
            }
            count++;
        } while (count <= 10);
        System.out.println("End!! You got " + score + " questions right out of 10 in "
                + (int) ((System.currentTimeMillis() - start) / 1000) + " seconds.");
    }

    public static int rand(int u, int l) {
        return (int) (Math.random() * u + l);
    }

    /*
     * public static int larger(int n1, int n2) { return n1 >= n2 ? n1 : n2; }
     */
    public static void hotCold(Scanner s) {
        int n = rand(100, 0);
        int guess;
        do {
            System.out.println("Guess a number from 0 to 100");
            guess = s.nextInt();
            if (guess < n)
                System.out.println("Your guess is too low");
            if (guess > n)
                System.out.println("Your guess is too high");
        } while (guess != n);
        System.out.println("Correct!");
    }

    public static void runAdd(Scanner s) {
        int n1 = rand(50, 1);
        int n2 = rand(50, 1);
        int res = n1 + n2;
        int ans;
        do {
            System.out.print("What is " + n1 + " + " + n2 + " ? ");
            ans = s.nextInt();
        } while (ans != res);
        System.out.println("Correct!");
    }
}
