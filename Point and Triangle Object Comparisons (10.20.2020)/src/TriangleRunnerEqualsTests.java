public class TriangleRunnerEqualsTests {
	public static void main(String[] args) {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.0, 3.0);
		Point p3 = new Point(3.0, 4.0);
		Point p4 = new Point(0.0, 0.0);
		Point p5 = p1;

		Triangle t1 = new Triangle(p1, p2, p3);

		System.out.println("t1 = " + t1);

		System.out.println("p1.equals(p2) is " + p1.equals(p2));
		System.out.println("p1 == p2 is " + (p1 == p2));
		System.out.println("p1.equals(p4) is " + p1.equals(p4));
		System.out.println("p1.equals(p5) is " + p1.equals(p5));
	}
}