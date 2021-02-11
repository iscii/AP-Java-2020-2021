import java.util.ArrayList;

public class SortUtil {
    public static ArrayList<Integer> copyIntegerList(ArrayList<Integer> al) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (Integer i : al)
            a.add(i);
        return a;
    }

    public static boolean isSorted(ArrayList<Integer> al) {
        for (int i = 0; i < al.size() - 1; i++)
            if (al.get(i) > al.get(i + 1))
                return false;
        return true;
    }

    public static ArrayList<Integer> randomInteger(int listLength, Integer maxVal) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < listLength; i++)
            a.add((int) (Math.random() * maxVal + 1));
        return a;
    }

    public static boolean sameSum(ArrayList<Integer> a, ArrayList<Integer> b) {
        int c = 0, d = 0;
        for (Integer i : a)
            c += i;
        for (Integer i : b)
            d += i;
        return c == d;
    }

    public static void swap(ArrayList<Integer> al, int i, int j) {
        int a = al.get(j);
        al.set(j, al.get(i));
        al.set(i, a);
    }

    public static int getMinIndex(ArrayList<Integer> al, int startidx) {
        int min = startidx;
        for (int i = startidx+1; i < al.size(); i++) {
            if(al.get(i)<al.get(min)) min=i;
        }
        return min;
    }

    public static void insertValue(Integer value, int stopIdx, ArrayList<Integer> al) {
        for(int i=0;i<stopIdx;i++){
            if(value<al.get(i)){
                al.add(i, value);
                return;
            }
        }
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> a) {
        ArrayList<Integer> b = copyIntegerList(a);
        while (!isSorted(b))
            for (int i = 0; i < b.size() - 1; i++)
                if (b.get(i) > b.get(i + 1))
                    swap(b, i, i + 1);
        return b;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
        ArrayList<Integer> b = copyIntegerList(a);
        for(int i=0;i<b.size();i++){
            swap(b, i, getMinIndex(b, i));
        }
        return b;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> a) {
        ArrayList<Integer> b = copyIntegerList(a);
        for(int i=1;i<b.size();i++){
            if(b.get(i-1)>b.get(i)){
                int c = b.get(i);
                b.remove(i);
                insertValue(c, i, b);
            }
        }
        return b;
    }
}
