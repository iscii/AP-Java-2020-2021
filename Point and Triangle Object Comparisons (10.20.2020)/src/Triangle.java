public class Triangle {
    Point p1;
    Point p2;
    Point p3;

    // Assume valid triangle
    public Triangle(Point newPoint1, Point newPoint2, Point newPoint3) {
        p1 = newPoint1;
        p2 = newPoint2;
        p3 = newPoint3;
    }

    // Setters
    public void setP1(Point newPoint1) {
        p1 = newPoint1;
    }

    public void setP2(Point newPoint2) {
        p2 = newPoint2;
    }

    public void setP3(Point newPoint3) {
        p3 = newPoint3;
    }

    // Getter
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public double perimeter() {
        double perimeterVal = distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
        return perimeterVal;
    }

    public boolean equals(Triangle t) {
        return p1 == t.getP1() && p2 == t.getP2() && p3 == t.getP3();
    }

    public String toString() {
        return "Triangle: s1 [" + p1 + "," + p2 + "] s2[" + p2 + "," + p3 + "] s3[" + p3 + "," + p1 + "]\n";
    }

}