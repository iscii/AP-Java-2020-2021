public class Main {
    public static void main(String[] args) throws Exception {
        Triangle t1 = new Triangle();

        Point p1 = new Point(14, 3);
        Point p2 = new Point(-14, 3);
        Point p3 = new Point(7, -3);
        Point p4 = new Point(8, -3);
        Triangle t2 = new Triangle(p1, p2, p3);

        System.out.println(t1.getPoint(1));
        System.out.println(t1);
        System.out.println(t2);
        t2.setPoint(2, p4);
        System.out.println(t2);
    }
}
