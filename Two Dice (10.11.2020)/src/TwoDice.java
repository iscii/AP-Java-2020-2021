import java.util.Arrays;

public class TwoDice {
    Die d1;
    Die d2;
    public TwoDice() {
        d1 = new Die();
        d2 = new Die();
    }
    public TwoDice(Die done, Die dtwo) {
        d1 = done;
        d2 = dtwo;
    }
    public String roll() {
        int[] arr = {d1.roll(), d2.roll()}; 
        return Arrays.toString(arr);
    }
}
