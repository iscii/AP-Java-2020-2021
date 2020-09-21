import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

//https://www.youtube.com/watch?v=eIrMbAQSU34
public class MoshTutorial {
    public static void main(String[] args) throws Exception {
        //Primitive data types
        /*
        byte [1 byte] [-128, 127]
        short [2 bytes] [-32k, 32k]
        int [4 bytes] [-2B, 2B]
        long [8 bytes] [any num < -2B or > 2B]
        float [4 bytes] [decimals]
        double [8 bytes] [larger decimals]
        char [2 bytes] [A, B, C...]
        boolean [1 byte] [true/false]
        */

        //byte age = 16; //include var type only upon initialize
        //int onemil = 1_000_000; //_ separates the number, kinda like how commas separate them in normal text for readability
        //long tenbil = 10_000_000_000L; //L makes the number a long; can be lowercase or uppercase. Must be mentioned; longs are defaulted to ints even when initialized as long.
        //float price = 10.99f; //f makes the number a float; can be lowercase or uppercase. floats are defaulted to doubles even when initialized as float.
        //char letter = 'A'; //chars should always be surrounded by '' (single quotes). multiple characters (Strings) should be surrounded by "" (double quotes).
        //boolean isTrue = false; 
        
        //Reference data types  
        Date now = new Date();
        System.out.println(now);
        
        //setting reference types to another works differently in memory than primitives (think abt javascript). point2 is a reference to point1 (both vars reference same block in memory) so if one variable is changed, so is the other
        //reference types are copied by reference [to memory block], primitive types are copied by their value
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        point2.y = 5;
        System.out.println(point1);

            //Strings
        String message = "       hello"; //strings are reference types in java (new String())
        message += "!!"; //concat string
        //strings are immutable
        //string methods that modify the string always return a new string
        //hover over methods to read description
        System.out.println(message.endsWith("a"));
        System.out.println(message.endsWith("!"));
        System.out.println(message.indexOf("!")); //returns index of first instance of character
        System.out.println(message.replace("!", "?")); //returns new string with all instances of character replaced by replacement character
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //returns new string with leading and trailing whitespaces removed (some users add unnecessary spaces in form fields)

                //String symbols
        String mquote = "Hello \"World\""; //backslash (escape character): for symbols that may intervene with string 
        String mlinebreak = "Hello\nWorld"; //\n for line break
        String mtab = "Hello\tWorld"; //\t for tab
        //C:\Users\Issac\Downloads
        String dir = "C:\\Users\\Issac\\Downloads";
        System.out.println(mquote);
        System.out.println(mlinebreak);
        System.out.println(mtab);
        System.out.println(dir);

            //Arrays 53:23
        int[] numbers = new int[5]; //declares array length. first index is 0
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 10; -> error: exceeds array length
        System.out.println(numbers); //prints address of array in memory
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1, 2, 0, 0, 5}; //arrays have a fixed length. 
        System.out.println(numbers2.length);

                //Multi-dimensional arrays (matrices)
        int[][] twonumbers = new int[2][3]; //[length of main array][length of arrays of main array]
        twonumbers[0][0] = 1;
        System.out.println(Arrays.deepToString(twonumbers)); //deeptostring for multidimensional arrays
        
        int[][] twonumbers2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(twonumbers2));

        //Constants
        final float PI = 3.14f; //conventional to name constant variables in UPPERCASE
        System.out.println(PI);
        //pi = 1; -> error - cannot change constant/final variables

        //Operators
            //Arithmetic
        //int add = 10 + 3;
        //int subtract = 10 - 3;
        //int multiply = 10 * 3;
        int divide = 10 / 3; //in java, division floors [rounds down] the result 
        double dividef = (double)10 / (double)3; //to make result a more specific decimal, convert operands to doubles and declare result variable as a double
        //int mod = 10 % 3; //remainder

        System.out.println(divide);
        System.out.println(dividef);
            //Increments
        int addone = 1;
        addone++;
        System.out.println(addone); //2

        //setting a new variable to the increment of another variable with increment on RIGHT side does not change the reference variable
        int one = 1;
        int two = one++;
        //setting a new variable to the increment of another variable with increment on LEFT side changes the reference variable
        int ones = 1;
        int twos = ++ones;
        System.out.println("one " + one);
        System.out.println("two " + two);
        System.out.println("ones " + ones);
        System.out.println("twos " + twos);

        int five = 5;
        five += 2; //five = five + 2
        //works with +, -, /, *
        System.out.println(five);

        //() -> */ -> +-
        int pemdas = 10 + 3 * 2;
        System.out.println(pemdas);
        int pemdas2 = (10 + 3) * 2;
        System.out.println(pemdas2);

            //operating on different data types [Implicit Casting]
        //double > float > long > int > short > byte
        short x = 1;
        int y = x + 2; //x is converted to an integer (the larger data type) and then add it.
        System.out.println(y);
        
        double xx = 1.1;
        double yy = xx + 2; //casts 2 into a double (2.0) and then adds
        System.out.println(yy);

        double xxx = 1.1;
        int yyy = (int)xxx + 2; //cast x into integer (removes decimals; rounds down). casting only works on numerical values
        System.out.println(yyy);

        String onestring = "1"; 
        String onepointonestring = "1.1";
        int parsedresult = Integer.parseInt(onestring) + 5; //parses string into integer. //parseShort, parseFloat, parseDouble, etc...
        double parseddoubleresult = Double.parseDouble(onepointonestring) + 3;
        System.out.println(parsedresult);
        System.out.println(parseddoubleresult);

            //Comparison operators
        //Boolean: (x == y), (x != y), (x < y), (x <= y)
        //Logical: &&, ||

        //Math
        int roundedfloat = Math.round(1.1f);
        System.out.println(roundedfloat);
        int ceiledfloat = (int) Math.ceil(1.1f); //must cast math.ceil fsr
        System.out.println(ceiledfloat);
        int max = Math.max(1, 5);
        System.out.println(max);
        double random = Math.random();
        System.out.println(random);
        int randomintunder100 =  (int) Math.round(Math.random() * 100); //((int)Math.random() * 100) will cast Math.random() into an int first (0) and then multiply by 100.
        System.out.println(randomintunder100);

        //Number formatting
        //NumberFormat currency = new NumberFormat(); //numberformat is abstract and thus cannot be instantiated
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String currencyResult = currency.format(1234.23213);
        String percentResult = percent.format(0.5434f);
        System.out.println(currencyResult);
        System.out.println(percentResult);

        //Method chaining
        String currencyResult2 = NumberFormat.getCurrencyInstance().format(598.23199);
        System.out.println(currencyResult2);

        //Reading Inputs
        Scanner scan = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scan.nextByte(); //input for byte values
        System.out.print("Name: ");
        scan.nextLine(); //https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        String name = scan.nextLine().trim(); //string input, but does not ignore characters past a space or break like next() does.
        System.out.println("Hello " + name + ", You are " + age); 
        scan.close(); //resource leak error thingy

        //If Statements [same as javascript]
            //simplifying if statements
            int income = 120_000;
            /*
            boolean hasHighIncome = false;
            if(income > 100_000)
                hasHighIncome = true;
            */
            boolean hasHighIncome = income > 100_000;
            System.out.println(hasHighIncome);

            //Ternary operator
            /*
            if(income > 100_000)
                classname = "First";
            else
                classname = "Economy";
            */
            String classname = income > 100_000 ? "First" : "Economy";
            System.out.println(classname);

        //Switch statements [same as javascript]
        //For loops [same as javascript]
        for (int i = 0; i < 5; i++) {
            System.out.println("for " + i);
        }

        //While loops [same as javascript]
        //good for input checking (where repeat count is not defined)
        int i = 5;
        while (i > 0){
            System.out.println("while " + i);
            i--;
        }

        int j = 5;
        //Do... While
        //executes at least once, and then checks for conditional. if passes, execute again.
        do{
            System.out.println("while " + i);
            j--;
        } while(j > 0);

        //Break and Continue [same as javascript]
        //Foreach [same as javascript] - iterate over arrays or collections
        String[] fruits = {"Apple", "Mango", "Orange"};
        //does not hold index; only value of key of array
        for (String fruit : fruits){ //for(item in fruits){}
            System.out.println(fruit);
        }
    }
}
