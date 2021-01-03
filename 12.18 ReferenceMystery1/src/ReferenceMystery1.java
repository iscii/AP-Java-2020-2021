import java.util.Arrays;

public class ReferenceMystery1 {
    public static void main(String[] args) {
        int x = 0;
        int[] a = new int[4];
        x++;
        
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        
        x++;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }
    
    public static void mystery(int x, int[] a) {
        x++;
        a[x]++;
        System.out.println(x + " " + Arrays.toString(a));
    }
}

 //mystery is called in main. primitive parameter x is passed in mystery with value 1 and modified (incremented) and printed in the method (= 2). reference parameter a is modified and printed ([0, 0, 1, 0])
 //2 [0, 0, 1, 0]
 //in main, the value of the local variable x is printed (x) which is only 1, since the modified x value in mystery was local. reference to array a was modified in mystery, so the modified array applies to main's reference as well.
 //1 [0, 0, 1, 0]
 //same as up top, but x increments and a is modified again.
 //3 [0, 0, 1, 1]
 //2 [0, 0, 1, 1]
 