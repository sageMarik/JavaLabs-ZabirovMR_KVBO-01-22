import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

class CalculatorButtonListener implements ActionListener {
    private final JTextField display;
    private String currentInput = "";
    private double result = 0;
    private String operator = "";
    private boolean newInput = true;

    public CalculatorButtonListener(JTextField display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (isNumeric(command)) {
            if (newInput) {
                currentInput = command;
                newInput = false;
            } else {
                currentInput += command;
            }
            display.setText(currentInput);
        } else if (command.equals("C")) {
            currentInput = "";
            result = 0;
            operator = "";
            display.setText("");
            newInput = true;
        } else if (command.equals("=")) {
            if (!operator.isEmpty()) {
                double num2 = Double.parseDouble(currentInput);
                result = calculate(result, num2, operator);
                currentInput = Double.toString(result);
                display.setText(currentInput);
                operator = "";
                newInput = true;
            }
        } else if (isOperator(command)) {
            if (!operator.isEmpty()) {
                actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "="));
                result = Double.parseDouble(currentInput);
                operator = command;
                newInput = true;
            } else {
                result = Double.parseDouble(currentInput);
                operator = command;
                currentInput = "";
                newInput = true;
            }
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }
}
