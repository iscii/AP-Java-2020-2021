package Uno;

import java.util.ArrayList;
public class Hand {
    ArrayList<Card> hand=new ArrayList<>();
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
    public int getSize(){
        return hand.size();
    }
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