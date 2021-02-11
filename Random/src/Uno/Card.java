package Uno;

class Card {
    String color;
    String type;
    public Card(String color, String type) {
        this.color=color;
        this.type=type;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public String toString(){
        return "<"+color+" "+type+">";
    }
}