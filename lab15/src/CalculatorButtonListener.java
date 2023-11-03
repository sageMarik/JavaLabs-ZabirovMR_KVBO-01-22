import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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