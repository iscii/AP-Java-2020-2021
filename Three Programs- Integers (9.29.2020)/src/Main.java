import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //the programs are easily exploitable or broken since there are no input restrictions.

        Scanner cIn = new Scanner(System.in);
        int num;
        do {
            System.out.println("---------------\nInput: \n[1] Average [2] Reverse [3] Increment [0] Exit\n---------------");
            num = cIn.nextInt();
            switch(num){
                case 1: Average(); break;
                case 2: Reverse(); break;
                case 3: Increment(); break;
            }
        }
        while(num != 0);
        System.out.println("Exited");
    }

    public static void Average() {
        //3 numbers
        int num1;
        int num2;
        int num3;

        Scanner iIn = new Scanner(System.in);
        System.out.println("Enter three numbers to return their average");
        System.out.println("First Number: ");
        num1 = iIn.nextInt();
        System.out.println("Second Number: ");
        num2 = iIn.nextInt();
        System.out.println("Third Number: ");
        num3 = iIn.nextInt();

        System.out.println("RESULT: " + (int)(num1 * num2 * num3)/3);
    }

    public static void Reverse() {
        //3 digits
        int num;

        Scanner iIn = new Scanner(System.in);
        System.out.println("3-digit Number: ");
        num = iIn.nextInt();

        System.out.println("RESULT: " + num%10 + num%100/10 + num/100);
    }
    public static void Increment() {
        int num;

        Scanner iIn = new Scanner(System.in);
        System.out.println("5-digit Number: ");
        num = iIn.nextInt();

        int[] digs = {num/10000, num/1000%10, num/100%10, num/10%10, num%10};
        for (int i = 0; i < digs.length; i++) {
            digs[i]++;
            if(digs[i] == 10) digs[i] = 0;
        }
        System.out.println("RESULT: " + digs[0] + digs[1] + digs[2] + digs[3] + digs[4]);
    }
}
