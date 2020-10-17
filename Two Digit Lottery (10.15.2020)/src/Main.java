import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String guess;
        int gnum1;
        int gnum2;

        int[] num = {rand(), rand()};
        System.out.println("What's the number?");
        //string
        //parseint
        //get each digit
        //compare
        guess = s.next();
        gnum1 = Integer.parseInt(guess)/10;
        gnum2 = Integer.parseInt(guess)%10;
      
        System.out.println(Arrays.toString(num));
        
        if(gnum1 == num[0] && gnum2 == num[1]) 
            System.out.println("You win 10$");
        else if(gnum1 == num[1] && gnum2 == num[0])
            System.out.println("You win 3$");
        else if(gnum1 == num[0] || gnum1 == num[1] || gnum2 == num[0] || gnum2 == num[1])
            System.out.println("You win 1$");
        else 
            System.out.println("You lose");
    }
    public static int rand() {
        return (int) (Math.random() * 10);
    }
}   
