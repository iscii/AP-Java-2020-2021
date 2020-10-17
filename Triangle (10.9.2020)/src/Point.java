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

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}