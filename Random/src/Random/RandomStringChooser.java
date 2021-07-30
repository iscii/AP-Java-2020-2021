public class RandomStringChooser {
    int idx;
    String[] randArr;
    public RandomStringChooser(String[] arr){
        idx=0;
        randArr = arr.clone();
        randomize(randArr);
    }
    void randomize(String[] arr){
        String t;
        int r;
        for(int i=0;i<randArr.length;i++){
            r = (int)(Math.random() * randArr.length);
            t = randArr[i];
            randArr[i] = randArr[r];
            randArr[r] = t;
        }
    }
    String getNext(){
        String s = idx < randArr.length ? randArr[idx] : "NONE";
        idx++;
        return s;
    }
}
