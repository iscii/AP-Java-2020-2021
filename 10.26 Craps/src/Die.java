public class Die {
    private int numDots;
    public Die() {
        numDots = 1;
    }
    public void roll() {
        numDots = (int)(Math.random() * 6 + 1);
    }
    public int getNumDots() {
        return numDots;
    }
}
