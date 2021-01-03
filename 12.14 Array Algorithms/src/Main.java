import java.lang.reflect.Array;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] arr = {51,81,81,49,2,0,1,13,7,9,2,3,5};
    int[] arr2 = {2, 10, 7};
    int[] arr3 = {1, 2, 3, 5, 7, 8, 10};
  
    System.out.println("print: " + ArrayAlgorithms.print(arr));
    System.out.println("getMax: " + ArrayAlgorithms.getMax(arr));
    System.out.println("getMin: " + ArrayAlgorithms.getMin(arr));
    System.out.println("getSum: " + ArrayAlgorithms.getSum(arr));
    System.out.println("getAvg: " + ArrayAlgorithms.getAvg(arr));
    System.out.println("getMode: " + Arrays.toString(ArrayAlgorithms.getMode(arr)));
    System.out.println("getEl: " + ArrayAlgorithms.getEl(arr, 7));
    System.out.println("hasEvenOdd: " + ArrayAlgorithms.hasEvenOdd(arr2, false));
    System.out.println("isEvenOdd: " + ArrayAlgorithms.isEvenOdd(arr2, true));
    System.out.println("getConsecs: " + Arrays.toString(ArrayAlgorithms.getConsecs(arr3)));
    System.out.println("getDupes: " + ArrayAlgorithms.getDupes(arr));
    System.out.println("getNumPrime: " + ArrayAlgorithms.getNumPrime(arr));
    System.out.println("shiftLR: " + Arrays.toString(ArrayAlgorithms.shiftLR(arr, 0, true)));
    System.out.println("reverseOrder: " + Arrays.toString(ArrayAlgorithms.reverseOrder(arr))); //might return weird array cos of all the mods its been thru after all these methods
  }
}