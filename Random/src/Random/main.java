class main{
    public static void main(String[] args){
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for(int k=0;k<6;k++){
            System.out.println(sChooser.getNext() + " ");
        }
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for(int k=0;k<4;k++){
            System.out.print(letterChooser.getNext());
        }
    }
}