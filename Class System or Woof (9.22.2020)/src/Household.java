public class Household {
    private Dog pet1;
    private Cat pet2;

    public Household(Dog p1, Cat p2) {
        pet1 = p1;
        pet2 = p2;
    }

    public void rollCall() {
        pet1.introduce();
        pet2.introduce();
    }
}
