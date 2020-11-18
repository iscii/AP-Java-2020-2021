public class Point {
    private double x;
    private double y;

    public Point(double setX, double setY) {
        x = setX;
        y = setY;
    }

    public void setX(double setX) {
        x = setX;
    }

    public void setY(double setY) {
        y = setY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    /*
    //overrides default Object.equals() method
    public boolean equals(Point p) { //i'd rather give the method another name
        return x == p.getX() && y = p.getY();
    }*/

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}