class Card {
    /**Two variables, one for color and one for type
    */
    String color;
    String type;
    /**Card constructor, takes in color and type and contructs a card object
    */
    public Card(String color, String type) {
        this.color=color;
        this.type=type;
    }
    /**A getter method to get the color of the card
    */
    public String getColor(){
        return color;
    }
    /**A setter method to set the color based on the parameter
    */
    public void setColor(String color){
        this.color=color;
    }
    /**A getter method to get the type of the card
    */
    public String getType(){
        return type;
    }
    /**A toString method to properly display the card object
    */
    public String toString(){
        return "<"+color+" "+type+">";
    }
}