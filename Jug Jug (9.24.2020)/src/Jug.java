import java.util.Scanner;

public class Jug {
    public String jugName;
    public int capacity;
    public float waterVolume;

    public Jug(String name, int cap) {
        jugName = name;
        capacity = cap;
        waterVolume = 0;
    }

    public void fill() {
        waterVolume = (float)capacity;
    }

    public void spill() {
        waterVolume = 0f;
    }

    public void transfer(Jug jug, Jug targetjug) {
        //6 > 5; remove 5 from 6, add 5 to 5.
        //5 > 6; add 5 to 6. 
        //5 > 6, with 3 in 6; add 3 to 6, remove 3 from 5.
        //5 > 6, with 3 in 6 and 1 in 5; remove 1 from 5 and add 1 to 6.
        //get potential capacity
        double potcap = targetjug.capacity - targetjug.waterVolume;
        if(potcap <= 0) {
            System.out.println("The target jug is full!");
            return;
        }
        double transferred = jug.waterVolume - potcap;
        targetjug.waterVolume += transferred;
        if(transferred < 0)
            jug.waterVolume -= transferred;
    }
}
