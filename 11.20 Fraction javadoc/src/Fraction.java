public class Fraction {
    int num;
    int den;

    public Fraction() {
        num = 1;
        den = 1;
    }

    public Fraction(int n) {
        num = n;
        den = 1;
    }

    public Fraction(int n, int d) {
        num = n;
        den = d;
        if (den == 0)
            den = 1;
    }

    public Fraction(Fraction f) {
        num = f.getNum();
        den = f.getDen();
    }

    public Fraction add(int m) {
        Fraction n = new Fraction(num + den * m, den);
        n.reduce();
        return n;
    }

    public Fraction add(Fraction f) {
        Fraction n = new Fraction(f.getDen() == den ? num + f.getNum() : num * f.getDen() + f.getNum() * den, f.getDen() == den ? den : den * f.getDen());
        n.reduce();
        return n;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public double getValue() {
        return (double)num / (double)den;
    }
    
    public Fraction multiply(int m) {
        Fraction n = new Fraction(m * num, den);
        n.reduce();
        return n;
    }
    
    public Fraction multiply(Fraction f) {
        System.out.println(num + " " + f.num);
        Fraction n = new Fraction(f.num * num, f.den * den);
        n.reduce();
        return n;
    }
    
    private int gcf(int n, int d) {
        n = Math.abs(n);
        d = Math.abs(d);
        for (int i = 2; i <= (n < d ? n : d); i++){
            if (n % i == 0 && d % i == 0){
                return i;
            }
        }
        return 1;
    }

    public void reduce() {
        int n = den < 0 ? -1 * (num / gcf(num, den)) : (num / gcf(num, den));
        den = den < 0 ? -1 * (den / gcf(num, den)) : (den / gcf(num, den));
        num = n;
    }

    public String toString() {
        return num + "/" + den;
    }
}
