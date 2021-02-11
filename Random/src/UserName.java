import java.util.ArrayList;

class UserName {

    /** The list of possible user names, based on a user’s first and last names 
     * and initialized by the constructor.
     */
    private ArrayList<String> possibleNames;

    /** Constructs a UserName object as described in part (a).
    * Precondition: firstName and lastName have length greater than 0   
    * and contain only uppercase and lowercase letters.
    */
    public UserName (String firstName, String lastName){
        possibleNames = new ArrayList<String>();
        for(int i=1;i<=firstName.length();i++){
            possibleNames.add(lastName + firstName.substring(0, i));
        }
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr){
        for(String s: arr){
            if(s.equals(name)) return true;
        }
        return false;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
    */
    public void setAvailableUserNames(String[] usedNames){
        for(int i=possibleNames.size()-1;i>=0;i--){
            if(isUsed(possibleNames.get(i), usedNames)){
                possibleNames.remove(i);
            }
        }
    }

    /** Gets contents of possibleNames */
    public ArrayList<String> getPossibleNames() {
        return possibleNames;
    }
}