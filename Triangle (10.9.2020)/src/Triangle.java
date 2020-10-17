public class Triangle {
    Point[] p = new Point[3];

    public Triangle() {
        p[0] = new Point(0, 1);
        p[1] = new Point(0, 0);
        p[2] = new Point(1, 0);
    }
    public Triangle(Point pone, Point ptwo, Point pthree) {
        p[0] = pone;
        p[1] = ptwo;
        p[2] = pthree;
    }
    public String getPoint(int index) {
        return p[index].toString();
    }
    public void setPoint(int index, Point point) {
        p[index] = point;
    }
    public String toString() {
        return "p1: " + p[0].toString() + "\np2: " + p[1].toString() + "\np3: " + p[2].toString();
    }
}
