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

    public double getDist(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}