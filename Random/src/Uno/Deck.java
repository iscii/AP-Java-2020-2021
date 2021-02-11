package Uno;

import java.util.ArrayList;
class Deck {
    final String[] types = {"0","1","2","3","4","5","6","7","8","9","skip","reverse","drawtwo","wild","drawfour"};
    final String[] colors = {"red","yellow","green","blue"};
    
    ArrayList<Card> deck = new ArrayList<Card>();
    
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
    
    public void shuffle() {
        for(int i=0;i<deck.size();i++){
            deck.add(i, deck.remove((int)(Math.random()*deck.size()-1)));
        }
    }

    public int getSize() {
        return deck.size();
    }

    public Card pop() {
        return deck.remove(0);
    }

    public String toString() {
        String s="";
        for(Card card:deck) s+=card + " "; 
        return s;
    }
}