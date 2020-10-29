public class Tester {
  public static void main (String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point (2, 3);
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    System.out.println(p1.distanceTo(p2));
  }
}
