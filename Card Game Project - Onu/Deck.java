import java.util.ArrayList;
class Deck {
    /**Two two string arrays, one to store all the different types of cards in uno, such as all the number cards, skips, reverses, etc. The other to store all the colors of the card, such as red, green, etc., and a special one called rainbow for wilds
    */
    final String[] types = {"0","1","2","3","4","5","6","7","8","9","skip","reverse","drawtwo","wild","drawfour"};
    final String[] colors = {"red","green","blue","yellow"};
    /**The deck arrayList is to store the whole deck
    */
    ArrayList<Card> deck = new ArrayList<Card>();
    /**Constructor for the deck class, a nested loop to loop through and create all possible types of cards with each colors
    */
    public Deck(){
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<types.length;j++){
                if(j<13){
                    if(j>0)
                        deck.add(new Card(colors[i],types[j]));
                    deck.add(new Card(colors[i],types[j]));
                }
                else if(i==colors.length-1){
                    for(int k=0;k<4;k++)
                        deck.add(new Card("rainbow",types[j]));
                }
            }
        }
    }
    /**A method to shuffle the whole deck
    */
    public void shuffle() {
        for(int i=0;i<deck.size();i++){
            deck.add(i, deck.remove((int)(Math.random()*deck.size()-1)));
        }
    }
    /**A getter method to get the size of the deck
    */
    public int getSize() {
        return deck.size();
    }
    /**A simply method to remove the very first card in the deck
    */
    public Card pop() {
        return deck.remove(0);
    }
    /**A toString method to display the deck object
    */
    public String toString() {
        String s="";
        for(Card card:deck) s+=card + " "; 
        return s;
    }
}