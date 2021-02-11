import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
//<(0o0<)  Welcome  (>0o0)>\\
class Main {
    /**Made certain types of variables static so that it can be accessed throughout the methods for more convenience
    */
    static int amtAdd,turn,you,dir;
    static Card discard;
	static Hand[] players;
  	public static void main(String[] args) throws Exception{
        Scanner in=new Scanner(System.in);
        Deck mainDeck=new Deck();
        mainDeck.shuffle();

	    players = new Hand[]{new Hand(mainDeck), new Hand(mainDeck), new Hand(mainDeck)};
        turn=0;
        dir=1;
        you=(int)(Math.random()*3);
        int index;
        String str;
        discard=mainDeck.pop();
        if(!isNumber(discard.getType(), true)){
            checkCard(discard, in, false);
        }
        boolean isDraw = false;
        //System.out.println(players[turn].getHand()); //temp reveal player hands
        
        displayMenu();

        while(checkGame()) { 
            System.out.println((turn==you?"\n------------------------------------------------------------------\n":"\n__________________________________________________________________\n"));
            System.out.println("Discarded card: "+discard+"\n");
            System.out.println((turn==you?"Your":"Player "+turn+"\'s")+" turn");
            System.out.println((turn==you?"Your":"Player "+turn+"\'s")+" hand: "+players[turn].getSize());
            if(turn==you){
                //display hand
                String tempColor = players[you].getGet(0).getColor();
                System.out.print("> "+tempColor+"s: ");
                for(int i=0;i<players[you].getSize();i++){
                    if(!players[you].getGet(i).getColor().equals(tempColor)){
                        System.out.println();
                        tempColor = players[you].getGet(i).getColor();
                        System.out.print("> "+tempColor+"s: ");
                    }
                    System.out.print("["+i+"]"+players[you].getGet(i)+" ");
                }
                System.out.println();
            }
            System.out.println((turn==you?"\n------------------------------------------------------------------\n":"\n__________________________________________________________________\n"));
            if(turn==you){
                System.out.print("Pick an index: "); //add spacing below
                str=in.nextLine();
                if(str.toLowerCase().equals("h")){
                    displayMenu();
                    continue;
                }
                else if(!isNumber(str, false)){
                    System.out.println("Invalid Input");
                    continue;
                }
                if(str.isEmpty()||!(Integer.parseInt(str)<=0||Integer.parseInt(str)>0))
                    index=-1;
                else
                    index=Integer.parseInt(str);
            }
            else
                index=cpuPlay();
            System.out.println("\n==================================================================\n");
            play(index, in, mainDeck);
            System.out.println("\n==================================================================\n\n");
            if(mainDeck.getSize()==0){
                for(int i=0;i<players.length;i++)
                    if(hasMove(false))
                        continue;
                isDraw = true;
                break;
            }
            try{
                TimeUnit.SECONDS.sleep(5);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(isDraw?turn==you?"Draw":"You Win!":"Player "+turn+" Wins");
  	}
    
    /** 
    *   Handles index input and the highest state of decisions in decision hierarchy
    *
    *   @param index the chosen index by the player
    *   @param in the Scanner stream
    *   @param mainDeck the main deck for drawing
    */
    public static void play(int index, Scanner in, Deck mainDeck){
        Card c;
        if(amtAdd>0){
            if(!hasMove(true)||!checkIndex(index)){
                for(int i=0;i<amtAdd;i++)
                    players[turn].put(mainDeck.pop());
                System.out.println((turn==you?"You":"Player "+turn)+" drew "+amtAdd+" cards");
                amtAdd=0;
                nextTurn(1);
            }
            else{
                c = players[turn].getGet(index);
                if(c.getType().equals("drawtwo")||c.getType().equals("drawfour"))
                    checkCard(players[turn].removeGet(index), in, true);
                else
                    System.out.println("Invalid move");
            }
        }
        else{
            //check index. draw
            if(!hasMove(false)||!checkIndex(index)){
                players[turn].put(mainDeck.pop());
                System.out.println((turn==you?"You":"Player "+turn)+" drew a card");
                nextTurn(1);
            } 
            else{
                //check card for playable
                c = players[turn].getGet(index);
                if(c.getColor().equals(discard.getColor())||c.getType().equals(discard.getType())||c.getColor().equals("rainbow"))
                    checkCard(players[turn].removeGet(index), in, true);
                else
                    System.out.println("Invalid move");
            }
        }
    }
    /**A method to check if the index is within the szie of the hand
    */
    public static boolean checkIndex(int index) {
        if(index<0||index>=players[turn].getSize())
            return false;
        return true;
    }
    /**Checks the type of card and execute the corresponding methods
    */
    public static void checkCard(Card c, Scanner in, boolean makePlay){
        if(!makePlay) System.out.println(c);
        boolean cont=true, skip=false;
        switch(c.getType()){
            case "skip": skip=true; break;
            case "reverse": reverse(); break;
            case "drawtwo": drawtwo(); break;
            case "drawfour": cont=drawfour(c, in, makePlay); break;
            case "wild": cont=wild(c, in, makePlay); break;
        }
        if(makePlay && cont) playCard(c);
        if(skip) skip();
    }
    /**Plays the card, displaying what card the player played, setting the discard to the card played, and incrementing the turn by 1
    */
    public static void playCard(Card c){
        discard = c;
        System.out.println((turn==you?"You":"Player "+turn)+" played "+c);
        nextTurn(1);
    }
    /**Method for skip, increment the turn by 1
    */
    public static void skip(){
        System.out.println("Skipped "+(turn==you?"your":"player "+turn+"\'s")+" turn");
        nextTurn(1);
    }
    /**Method for reverse, changes the direction by multiplying it by -1
    */
    public static void reverse(){
        dir*=-1;
    }
    /**Method for drawtwo, adds 2 to the variable amtAdd
    */
    public static void drawtwo(){
        amtAdd+=2;
    }
    /**Method for drawfour, adds 4 to the variable amtAdd
    */
    public static boolean drawfour(Card c, Scanner in, boolean makePlay){
        amtAdd+=4;
        return wild(c,in,makePlay);
    }
    //change the color of the wildcard to user's choice
    public static boolean wild(Card c, Scanner in, boolean makePlay){
        if(!makePlay){
            c.setColor(getColor(true));
            return true;
        }
        else{
            if(turn==you){ //player
                System.out.print("Pick a color: ");
                String str=in.nextLine();
                str=str.toLowerCase();
                if(str.equals("red")||str.equals("yellow")||str.equals("green")||str.equals("blue"))
                    c.setColor(str);
                else{
                    System.out.println("Invalid move");
                    players[turn].put(c); //issac is here, eys qijieisqijie, sey
                    return false;
                }
            }
            else //cpu
                c.setColor(getColor(false));
        }
        return true;
    }

    //get cpu playable card's index
    public static int cpuPlay(){
        Card c;
        //prio stacking
        if(amtAdd>0){
            if(hasMove(true)){
                for(int i=0;i<players[turn].getSize();i++){
                    c=players[turn].getGet(i);
                    if(c.getType().equals("drawtwo")||c.getType().equals("drawfour"))
                        return i;
                }
            }
            return -1;
        }

        //check numbers first
        for(int i=0;i<players[turn].getSize();i++){
            c = players[turn].getGet(i);
            if(c.getType().equals(discard.getType()))
                return i;
        }
        //check colors
        for(int i=0;i<2;i++){
            for(int j=0;j<players[turn].getSize();j++){
                //check color with number
                c=players[turn].getGet(j);
                if(i==0 && isNumber(c.getType(), true) && c.getColor().equals(discard.getColor()))
                    return j;
                //check color in general
                if(i==1 && c.getColor().equals(discard.getColor()))
                    return j;
                    //if time make smart here with type plays
            }
        }
        //last resort rainbows
        for(int i=0;i<players[turn].getSize();i++){
            c=players[turn].getGet(i);
            if(c.getColor().equals("rainbow"))
                return i;
        }
        return -1;
    }
    /**A method to see if player has any valid move to play
    */
    public static boolean hasMove(boolean choice){
        if(choice){
            for(Card c: players[turn].getHand()){
                if(c.getType().equals("drawtwo")||c.getType().equals("drawfour"))
                    return true;
            }
        }
        else{
            for(Card c: players[turn].getHand()){
                if(c.getColor().equals(discard.getColor())||c.getType().equals(discard.getType())||c.getColor().equals("rainbow"))
                    return true;
            }
        }
        return false;
    }
    /**Checks if mainDeck has no more cards left, and decides whether to go on a draw or not 
    */
    public static boolean checkGame() {
        for(Hand h: players) 
            if(h.getSize()<=0) 
                return false;
        return true;
    }
    /**Checks if the type is a number card
    */
    public static boolean isNumber(String s, boolean checkCard) {
        if(checkCard){
            if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) return true;
            return false;
        }
        try {  
            Integer.parseInt(s);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
    }
    /**A method for the A.I. to decide what color to choose when they played wild or drawfour
    */
    public static String getColor(boolean isRandom) {
        if(isRandom){
            String[] colors={"red","blue","green","yellow"};
            return colors[(int)(Math.random()*4)];
        }
        //ai plays
        String[] colors={"red","blue","green","yellow","rainbow"};
        ArrayList<Integer> count = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
        for(Card c: players[turn].getHand()){
            for(int i=0;i<colors.length;i++){
                if(c.getColor().equals(colors[i])){
                    count.set(i, count.get(i)+1);
                    break;
                }
            }
        }
        for(int i=0;i<count.size();i++){
            if(count.get(i) == Collections.max(count))
                return colors[i];
        }
        return "";
    }
    /**The method that increment the turn by 1 and takes into consideration the sign of the direction
    */
    public static void nextTurn(int mod){
        turn+=mod*dir;
        if(turn>2)
            turn=0;
        if(turn<0)
            turn=2;
        //System.out.println("new turn: "+turn+", mod: "+mod+", dir: "+dir);
    }
    public static void displayMenu() {
        System.out.println("_____________________________________________________________________________\n");
        System.out.println("********To display the help menu, input h rather than a card index********\n");
        System.out.println("Welcome to Onu\nThis game follows the rules of the game called Uno, but with several twists:\n\t- The game starts with a card from the deck and it can start with special cards.\n\t- Draw cards may be stacked.");
        System.out.println("Notes to play Onu:\n\t- The game always starts with position 0, but your position is randomized.\n\t- There are three players, including yourself");
        System.out.println("Instructons:\n\t- On your turn, enter the index of the card you wish to play.\n\t\t- The card must match in color or number.\n\t\t- Your hand along with each card's index is displayed.\n\t\t- Grouped by color, after the symbol \">\"\n\t- To draw a card, press enter. You will also draw a card if you enter an invalid input\n\t- When the discarded card is a draw card, you may attempt to stack another draw card.\n\t- If you have no valid moves, inputting any value will cause you to draw a card.\n\t- Upon playing a wildcard, you must specify the color to set.\n\t- Wildcards' colors will be revealed as a discarded card\n\t\t- <color> wild or <color> drawfour");
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}