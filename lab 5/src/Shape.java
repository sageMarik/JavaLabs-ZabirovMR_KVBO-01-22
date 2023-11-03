import java.awt.*;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Метод для отрисовки фигуры
    public abstract void draw(Graphics g);
}

// Класс для описания круга


// Класс для описания прямоугольника

