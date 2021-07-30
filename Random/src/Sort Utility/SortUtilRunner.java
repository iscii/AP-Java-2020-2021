import java.util.ArrayList;

public class SortUtilRunner {
    public static void main(String[] args) {
        insertionSort();
    }
    public static void insertionSort() {
        ArrayList<Integer> a = SortUtil.randomInteger(10, 10);
        ArrayList<Integer> b = SortUtil.insertionSort(a);
        System.out.println(b);
        System.out.println(SortUtil.sameSum(a, b));
    }
    public static void bubbleSort() {
        ArrayList<Integer> a = SortUtil.randomInteger(10, 10);
        ArrayList<Integer> b = SortUtil.bubbleSort(a);
        System.out.println(b);
        System.out.println(SortUtil.sameSum(a, b));
    }
    public static void selectionSort() {
        ArrayList<Integer> a = SortUtil.randomInteger(10, 10);
        ArrayList<Integer> b = SortUtil.selectionSort(a);
        System.out.println(b);
        System.out.println(SortUtil.sameSum(a, b));
    }
}
