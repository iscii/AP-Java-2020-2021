public class UserNameRunner {
    public static void main(String[] args) throws Exception {
        UserName johnSmith = new UserName("john", "smith"); //calls constructor for username. populates possibleNames of username with possible names for john smith
        System.out.println(johnSmith.getPossibleNames()); //prints the possible names for john smith
        UserName maryHart = new UserName("mary", "hart"); //calls constructor for username. populates possibleNames of username with possible names for mary hart
        System.out.println(maryHart.getPossibleNames()); //prints the possible names for mary hart
        String[] used = {"harta", "hartm", "harty"};
        maryHart.setAvailableUserNames(used); //removes used names specified in the array used from possibleNames of mary hart
        System.out.println(maryHart.getPossibleNames()); //prints the possible names for mary hart

        UserName dorothyVaughan = new UserName("dorothy", "vaughan"); //calls constructor for username. populates possibleNames of username with possible names for dorothy vaughan
        System.out.println(dorothyVaughan.getPossibleNames()); //prints the possible names for dorothy vaughan
        used = new String[]{"vaughand","vaughando"};
        dorothyVaughan.setAvailableUserNames(used); //removes used names specified in the array used from possibleNames of dorothy vaughan
        System.out.println(dorothyVaughan.getPossibleNames()); //prints the possible names for dorothy vaughan
    }
}
