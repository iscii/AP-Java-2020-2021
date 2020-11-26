import java.util.ArrayList;

public class codingbat {
    public static boolean xyzMiddle(String str) {
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("xyz")){
                System.out.println(i);
                System.out.println(str.length() - (i + 3));
                System.out.println(Math.abs(i - (str.length() - (i + 3))));
            }
        }
        return false;
    }
    public void test() {
    }
}
