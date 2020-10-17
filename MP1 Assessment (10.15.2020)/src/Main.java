import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack;
        Scanner s = new Scanner(System.in);
        int age = 0;
        String name = null;
        String input;
        System.out.println("What is your name? Enter 0 to skip");
        input = s.nextLine();
        name = input;
        System.out.println("What is your age? Enter 0 to skip");
        input = s.next();
        age = Integer.parseInt(input);
        if(name.equals("0") && age == 0)
            stack = new Stack();
        else if(name.equals("0"))
            stack = new Stack(age);
        else if(age == 0)
            stack = new Stack(name);
        else
            stack = new Stack(age, name);

        stack.run();
        s.close();
    }
}
