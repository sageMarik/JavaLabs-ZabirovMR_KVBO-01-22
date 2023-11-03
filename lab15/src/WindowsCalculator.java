import javax.swing.*;
import java.awt.*;

public class WindowsCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new BorderLayout());

        JTextField display = new JTextField();
        display.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        panel.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        panel.add(buttonPanel, BorderLayout.CENTER);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        CalculatorButtonListener listener = new CalculatorButtonListener(display);

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            buttonPanel.add(button);
            button.addActionListener(listener);
        }

        frame.setVisible(true);
    }
}


