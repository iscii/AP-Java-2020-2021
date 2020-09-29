import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Jug jug1 = new Jug("5Jug", 5);
        Jug jug2 = new Jug("6Jug", 6);

        System.out.println("There are 2 jugs. One holds 5 gallons of water. The other holds 6 gallons.\nThere are no measuring lines on the jugs. There’s a tap with limitless water that you can use to fill either of the jugs at any time.\nYour goal is to put exactly 2 gallons of water into the six gallon jug. How do you do that?");
        Scanner fIn = new Scanner(System.in);
        String action;
        do{
            display(jug1, jug2);

            System.out.println("Actions:\nfill [JugNum]\spill [JugNum]\ntransfer [JugNum] [TargetJugNum]\nexit");
            action = fIn.nextLine();
            String[] specs = action.split(" ");
            Jug jug;
            if(args[1] == "1") jug = jug1; else jug = jug2;
            switch(action){
                case "fill":{

                    break;
                }
                case "spill": {
                    
                    break;
                }
                case "transfer" : {
                    Jug targetjug;
                    if(args[2] == "1") targetjug = jug1; else targetjug = jug2;

                    jug1.transfer(Jug jug, Jug targetjug);
                    break;
                }
            }
        }
        while(jug2.waterVolume != 2 && action != "exit");
        if(action == "exit")
            System.out.println("Exited");
        
    }
    public static void display(Jug jug1, Jug jug2) {
        System.out.println("Jug 1: Capacity [" + jug1.capacity + "] : Water Volume [" + jug1.waterVolume + "]");
        System.out.println("Jug 2: Capacity [" + jug1.capacity + "] : Water Volume [" + jug1.waterVolume + "]");
    }
}
