package p02.third;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(2.5, 7.5);
        Circle circle1 = new Circle(0.5, point1);
        System.out.println(circle1);
    }
}
