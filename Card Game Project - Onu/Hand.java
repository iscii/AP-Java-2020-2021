import java.util.ArrayList;
public class Hand {
    ArrayList<Card> hand=new ArrayList<>();
    /**Constructor where it takes the first 7 cards from deck deck
    */
    public Hand(Deck d){
        draw(d, 7);
    }
    /** Precondition: count < d.size()
    */
    public void draw(Deck d, int count){
        for(int i=0;i<count;i++){
            put(d.pop());
        }
    }
    /**Puts a new card, ordered based on the colors so the hand is sorted
    */
    public void put(Card c1){
        boolean sameColor=false;
        if(hand.size()==0)
            hand.add(c1);
        else{
            for(int i=0;i<hand.size();i++){
                if(c1.getColor().equals(hand.get(i).getColor()))
                    sameColor=true;
                if(sameColor){
                    hand.add(i,c1);
                    break;
                }
                else if(i==hand.size()-1){
                    hand.add(c1);
                    break;
                }
            }
        }
    }
    /**A getter method for size of the hand object
    */
    public int getSize(){
        return hand.size();
    }
    /**Returns the card at the specified index
    */
    public Card getGet(int idx) {
        return hand.get(idx);
    }
    /**A method to remove the card in the hand based on the specified index
    */
    public Card removeGet(int idx) {
        return hand.remove(idx);
    }
    /**A getter method to get the hand
    */
    public ArrayList<Card> getHand(){
        return hand;
    }
    public String toString(){
        String str="";
        for(int i=0;i<hand.size();i++){
            str+=hand.get(i);
            if(i<hand.size()-1)
                str+=", ";
        }
        return str;
    }
}