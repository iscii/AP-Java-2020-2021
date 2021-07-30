import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of arrays (rows): ");
        int r = s.nextInt();
        System.out.print("Enter the length of arrays (columns): ");
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        int st=0;
        int[] sr = new int[r];
        int[] sc = new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int n = (int)(Math.random()*10);
                arr[i][j] = n;
                st+=n;
                sr[i]+=n;
                sc[j]+=n;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Sum of all elements: "+st);
        System.out.println("Sum of each row (indices are respective): "+Arrays.toString(sr));
        System.out.println("Sum of each column (indices are respective): "+Arrays.toString(sc));
        s.close();
    }
}
