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
 
// awt = ABSTRACT WINDOW TOOLKIT
// AWT = handles all the foundation of the website eg: adding custom design and adding event listener to the button

// swing = for creating a java web interface it controlls all the GRAPHICAL SECTION (GUI) of the Java Applicaton

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

        // event listener based on the button clicked
     
     // when click ADD button
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());  // way of extracting number from text field
                    int number2 = Integer.parseInt(numberField2.getText());  // way of extracting number from text field

                    int result = number1 + number2;
                    resultArea.append(String.valueOf(number1 + " + " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

     // when click subtract button
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());  // way of extracting number from text field
                    int number2 = Integer.parseInt(numberField2.getText());  // way of extracting number from text field

                    int result = number1 - number2;
                    resultArea.append(String.valueOf(number1 + " - " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

     // when click MULTIPLY button
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());  // way of extracting number from text field
                    int number2 = Integer.parseInt(numberField2.getText());  // way of extracting number from text field

                    int result = number1 + number2;
                    resultArea.append(String.valueOf(number1 + " * " + number2 + " = " + result + "\n"));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

     // when click DIVIDE button
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());   // way of extracting number from text field
                    int number2 = Integer.parseInt(numberField2.getText());  // way of extracting number from text field

                    float result = number1 / number2;  // since the divison result will be in float eg: 1.5 float is defined for that 
                    resultArea.append(String.valueOf(number1 + " / " + number2 + " = " + result + "\n"));  // adding the result into the text field 

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());  // givees error message
                }
            }
        });

        // adding text field in the workspace
        panel.add(numberField1); 
        panel.add(numberField2);

        panel.add(plus); 
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);

        frame.add(panel, BorderLayout.NORTH);  // BORDER LAYOUT IS NOT NECESSARY HERE
        
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);  // NOTE: WITHOUT OUT DEFINING BORDER LAYOUT IN IT
        
        // frame initalize
        frame.pack();    // set the frame size according to the size of the input field or buttons
        frame.setVisible(true);  // allows the frame to be vissible

        // close the java application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
