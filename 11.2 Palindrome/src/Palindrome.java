import java.util.Scanner;

public class Palindrome {
    public void runLetter(Scanner s) {
        String str;
        str = s.nextLine().toLowerCase(); //here since s.nextLine() returns an empty string when the method is first called from main
        while(true){
            String bkwds = "";
            System.out.print("Enter a phrase: ");
            str = s.nextLine().toLowerCase();
            if(str.equals("0")) break;

            for(int i=str.length()-1;i>=0;i--){
                bkwds += str.substring(i, i+1);
            }
            System.out.println("["+bkwds+"]");
            if(str.equals(bkwds)) System.out.println(str + " is a palindrome");
            else System.out.println(str + " is not a palindrome");
        }
        System.out.println("exited");
    }
    public void runWord(Scanner s) {
        String str;
        String sstr;
        String[] arr;
        str = s.nextLine().toLowerCase(); //here since s.nextLine() returns an empty string when the method is first called from main
        while(true){
            String bkwds = "";
            System.out.print("Enter a sentence: ");
            str = s.nextLine().toLowerCase();
            if(str.equals("0")) break;
            arr = str.split(" ");
            sstr = str.replace(" ", "");

            for(int i=arr.length-1;i>=0;i--){
                bkwds += arr[i];
            }
            System.out.println("["+bkwds+"]");
            if(sstr.equals(bkwds)) System.out.println(str + " is a word palindrome");
            else System.out.println(str + " is not a word palindrome");
        }
        System.out.println("exited");
    }
}