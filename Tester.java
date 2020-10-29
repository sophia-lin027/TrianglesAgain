public class Tester {
  public static void main (String[] args) {
    Point p1 = new Point (2, 2);
    Point p2 = new Point (7, 5);
    Point p3 = new Point (2, 2);
    Point p4 = new Point (3, 9);
    Triangle t1 = new Triangle (p1, p2, p4);
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    System.out.println(p1.distanceTo(p2));
    System.out.println(p1.equals(p3));
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
  }
}
