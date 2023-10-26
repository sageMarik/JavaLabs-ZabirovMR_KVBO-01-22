import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesDrawing extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private final Shape[] shapes;

    public RandomShapesDrawing() {
        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (i % 2 == 0) {
                int radius = random.nextInt(50) + 20;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes Drawing");
        RandomShapesDrawing panel = new RandomShapesDrawing();

        frame.add(panel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}