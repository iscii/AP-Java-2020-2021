import java.util.HashMap;
import java.util.ArrayList;

public class ArrayAlgorithms {
    public static String print(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + " ";
        }
        return s;
    }

    public static int getMax(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > a)
                a = arr[i];
        return a;
    }

    public static int getMin(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < a)
                a = arr[i];
        return a;
    }

    public static int getSum(int[] arr) {
        int s = 0;
        for (int i : arr)
            s += i;
        return s;
    }

    public static double getAvg(int[] arr) {
        return Math.round((double) getSum(arr) / (double) arr.length * 100) / (double) 100;
    }

    public static Integer[] getMode(int[] arr) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>(); // maps occurence
        for (int i : arr)
            if (a.get(i) != null)
                a.put(i, a.get(i) + 1);
            else
                a.put(i, 1);
        int b = 0; // largest occurence value
        for (HashMap.Entry<Integer, Integer> entry : a.entrySet())
            if (entry.getValue() > b)
                b = entry.getValue();
        ArrayList<Integer> c = new ArrayList<Integer>(); // holds all keys with greatest occurence
        for (HashMap.Entry<Integer, Integer> entry : a.entrySet())
            if (entry.getValue() == b)
                c.add(entry.getKey());
        Integer[] d = new Integer[c.size()];
        d = c.toArray(d);
        return d;
    }

    public static int getEl(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n)
                return i;
        return -1;
    }

    public static boolean hasEvenOdd(int[] arr, boolean tefo) { // tefo: true even, false odd
        for (int i : arr)
            if ((tefo && i % 2 == 0) || (!tefo && i % 2 == 1))
                return true;
        return false;
    }

    public static boolean isEvenOdd(int[] arr, boolean tefo) {
        for (int i : arr)
            if ((tefo && i % 2 == 1) || (!tefo && i % 2 == 0))
                return false;
        return true;
    }

    public static Integer[] getConsecs(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            if (i != arr.length - 1 && ((arr[i] + 1) == arr[i + 1]))
                a.add(i);
        return a.toArray(new Integer[a.size()]);
    }

    public static HashMap<Integer, Integer> getDupes(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i : arr)
            if (h.get(i) != null)
                h.put(i, h.get(i) + 1);
            else
                h.put(i, 1);
        HashMap<Integer, Integer> j = new HashMap<Integer, Integer>();
        for (HashMap.Entry<Integer, Integer> entry : h.entrySet())
            if (entry.getValue() > 1)
                j.put(entry.getKey(), entry.getValue());
        return j;
    }

    public static int getNumPrime(int[] arr) {
        int count = 0;
        loop1: for (int i : arr) {
            if (i == 0 || i == 1)
                continue;
            if (i == 2) {
                count++;
                continue;
            }
            for (int j = 2; j < i / 2; j++)
                if (i % j == 0)
                    continue loop1;
            count++;
        }
        return count;
    }

    public static int[] shiftLR(int[] arr, int idx, boolean tlfr) { //true left, false right
        int t;
        if(tlfr){
            t = arr[idx];
            if(idx == 0){
                arr[idx] = arr[arr.length-1];
                arr[arr.length-1] = t;
            }
            else {
                arr[idx] = arr[idx - 1];
                arr[idx - 1] = t;
            }
        }
        else{
            t = arr[idx];
            if(idx == arr.length-1){
                arr[idx] = arr[0];
                arr[0] = t;
            }
            else{
                arr[idx] = arr[idx + 1];
                arr[idx + 1] = t;
            }
        }
        return arr;
    }

    public static Integer[] reverseOrder(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            a.add(arr[i]);
        }
        return a.toArray(new Integer[a.size()]);
    }
}