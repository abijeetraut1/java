import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

// event listener
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("adder");
        JPanel panel = new JPanel();
        JTextArea resultArea = new JTextArea(10, 30);

        JTextField numberField1 = new JTextField(10);
        JTextField numberField2 = new JTextField(10);

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        // event listener
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());
                    int number2 = Integer.parseInt(numberField2.getText());

                    int result = number1 + number2;
                    resultArea.append(String.valueOf(number1 + " + " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());
                    int number2 = Integer.parseInt(numberField2.getText());

                    int result = number1 - number2;
                    resultArea.append(String.valueOf(number1 + " - " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());
                    int number2 = Integer.parseInt(numberField2.getText());

                    int result = number1 + number2;
                    resultArea.append(String.valueOf(number1 + " * " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());
                    int number2 = Integer.parseInt(numberField2.getText());

                    float result = number1 / number2;
                    resultArea.append(String.valueOf(number1 + " / " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        // adding button
        panel.add(numberField1);
        panel.add(numberField2);

        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        // frame initalize
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
