public class Meal {
    String entree;
    double cost;
    public Meal(String n, double c){
        entree = n;
        cost = c;
    }
    public String toString(){
        return entree + " meal, $" + cost;
    }
}
