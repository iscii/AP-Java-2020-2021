public class DeluxeMeal extends Meal{
    String side;
    String drink;

    public DeluxeMeal(String n, String s, String d, double c){
        super(n, c + 3);
        side = s;
        drink = d;
    }
    public String toString(){
        return "deluxe " + super.entree + " meal, $" + super.cost;
    }
}
