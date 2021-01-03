public class TriangleRunner {
    public static void main(String[] args) {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 0.0);
        Point p3 = new Point(3.0, 4.0);

        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.print(t1);
        System.out.println("t1.distance(p1,p2) = " + t1.distance(p1, p2));
        System.out.println("t1.distance(p2,p3) = " + t1.distance(p2, p3));
        System.out.println("t1.distance(p3,p1) = " + t1.distance(p3, p1));
        System.out.println("t1.perimeter() = " + t1.perimeter());

    }
}