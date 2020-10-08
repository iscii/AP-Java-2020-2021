public class Main {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time();
        Time t2 = new Time(1, 1, 69);
        Time t3 = new Time(1, 59, 59);
        Time t4 = new Time();
        
        //test increments
        t1.increment();
        t2.increment();
        t3.increment();
        t4.increment();
        //print
        System.out.println(t1+"\n"+t2+"\n"+t3+"\n"+t4);
        System.out.println(t1.toString().equals(t2.toString()));
        System.out.println(t1.toString().equals(t4.toString())); //built in string comparison
        System.out.println(t3.getSeconds() > t4.getSeconds()); //compare time values
        //test resets
        t1.reset(5, 13, 15);
        t2.reset(0, 0, 0);
        t3.reset(1, 1, 1);
        //reset
        System.out.println(t1+"\n"+t2+"\n"+t3+"\n"+t4);
    }
}
