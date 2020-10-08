public class Time {
    private int hrs;
    private int mins;
    private int secs;

    // initialize everything to zero
    public Time() {
        hrs = 1;
        mins = 1;
        secs = 1;
    }

    // initialzie to h, m and s
    public Time(int h, int m, int s) {
        hrs = h;
        mins = m;
        secs = s;

        cap();
    }

    // reset time
    public void reset(int h, int m, int s) {
        hrs = h;
        mins = m;
        secs = s;

        cap();
    }

    private void cap() {
        if(secs == 0) secs = 1; if (mins == 0) mins = 1; if(hrs == 0) hrs = 1;
        if(secs >= 60) {
            mins += secs/60;
            secs = secs%60;
        }
        if(mins >= 60) {
            hrs += mins/60;
            mins = mins%60;
        }
        if(hrs >= 24) {
            hrs = hrs%24;
        }
    }

    // Advances time by 1 second - Tricky! Let me know if you need a hint!
    public void increment() {
        secs++;
        if(secs == 60) {
            mins++;
            secs = 1;
        }
        if(mins == 60) {
            hrs++;
            mins = 1;
        }
        if(hrs == 24) {
            hrs = 1;
        }
    }

    public int getSeconds() {
        return secs + mins*60 + hrs*3600;
    }

    public String toString() {
        return hrs+":"+mins+":"+secs;
    }
}