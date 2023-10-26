package Point;

public class Tester {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        int numCircles = 0;

        // добавляем несколько окружностей в массив
        circles[numCircles++] = new Circle(new Point(0, 0), 1);
        circles[numCircles++] = new Circle(new Point(3, 4), 2.5);
        circles[numCircles++] = new Circle(new Point(-2, 1), 0.5);

        // выводим информацию о каждой окружности
        for (int i = 0; i < numCircles; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            double radius = circle.getRadius();
            System.out.println("Circle " + (i + 1) + ": center=(" + center.getX() + "," + center.getY() + "), radius=" + radius);
        }
    }
}