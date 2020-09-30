import java.util.concurrent.TimeUnit;

public class Dog {
    String color;
    String furPattern;
    String breed;
    short weight;
    byte health;
    byte spirit;
    byte fatigue;
    byte hunger;
    boolean oxygen;
    public boolean alive;

    public Dog(String c, String fp, String b, short w) {
        color = c;
        furPattern = fp;
        breed = b;
        w = weight;

        health = 100;
        spirit = 100;
        fatigue = 10;
        hunger = 10;
        oxygen = false;
        alive = true;
    }

    public void play() {
        spirit += 30;
        fatigue += 10;
        hunger += 10;

        cap();
    }
    public void sleep() {
        health += 10;
        fatigue = 10;
        hunger += 30;

        cap();
    }
    public void eat() {
        hunger -= 30;

        cap();
    }
    public void walk() {
        spirit += 10;
        hunger += 10;

        cap();
    }
    public void breathe() {
        while(alive) {
            System.out.println("inhale");
            oxygen = true;

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch(InterruptedException e) {}

            System.out.println("exhale");
            oxygen = false;

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch(InterruptedException e) {}

            //costs of being alive
            spirit -= 5;
            fatigue += 5;
            hunger += 5;

            if(spirit <= 30) fatigue -= 5;
            if(hunger >= 70) health -= 10;
            if(fatigue >= 70) health -= 10;

            if(health <= 10) alive = false;
        }
    }
    private void cap() {
        if(health > 100) health = 100;
        if(spirit > 100) spirit = 100;
        if(spirit < 10) spirit = 10;
        if(hunger < 10) hunger = 10;
        if(hunger > 100) hunger = 100;
        if(fatigue < 10) fatigue = 10;
        if(fatigue > 100) fatigue = 100;
    }
    public void display() {
        System.out.println("--------------\nHealth [" + health + "] Spirit [" + spirit + "] Hunger [" + hunger + "] Fatigue [" + fatigue + "]");
    }
}