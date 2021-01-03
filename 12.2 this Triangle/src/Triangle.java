public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    double s1;
    double s2;
    double s3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        s1 = distance(this.p1, this.p2);
        s2 = distance(this.p2, this.p3);
        s3 = distance(this.p3, this.p1);
    }

    // Getters (aka accessors)
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    // Setters (aka mutators)
    public void setP1(Point p1) {
        this.p1 = p1;
        s1 = distance(this.p1, this.p2);
        s3 = distance(this.p3, this.p1);
    }

    public void setP2(Point p2) {
        this.p2 = p2;
        s2 = distance(this.p2, this.p3);
        s1 = distance(this.p1, this.p2);
    }

    public void setP3(Point p3) {
        this.p3 = p3;
        s2 = distance(this.p2, this.p3);
        s3 = distance(this.p3, this.p1);
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getY() - p1.getY(), 2) + Math.pow(p2.getX() - p1.getX(), 2));
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    public double perimeter() {
        return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
    }

    public String toString() {
        return "(" + p1 + "," + p2 + "," + p3 + ")\n";
    }
}