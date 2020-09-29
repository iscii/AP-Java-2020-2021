import java.util.Scanner;

public class PrimitiveTypes {
    public PrimitiveTypes() {
        
    }
    public static void messageForJava() {
        System.out.println("############");
        System.out.println("# I \"Love\" #");
        System.out.println("#   Java!  #");
        System.out.println("############");
    }
    
    public static void qAndR() {
        Scanner iIn = new Scanner(System.in);
        System.out.print("Numerator: ");
        int num = iIn.nextInt();
        System.out.print("Denominator: ");
        int den = iIn.nextInt();

        System.out.println(num + " divided by " + den + " is " + num/den + " with remainer " + num%den);
        //iIn.close(); //-> closing scanner closes the System.in stream for future scanners as well
    }

    public static void fToC() {
        Scanner fIn = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        int f = fIn.nextInt();

        System.out.println("Celsius: " + ((double)(f-32)*5/9));
        fIn.close();
    }
}