public class Cow {
    String type;
    String sound;
    int nummilkings;

    public Cow(String t, String s) {
        type = t;
        sound = s;
        nummilkings = 0;
    }

    public void milkCow() {
        nummilkings++;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public int getNumMilkings() {
        return nummilkings;
    }
}
