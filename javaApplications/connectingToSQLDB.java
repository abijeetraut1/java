import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// DATABASE CONNECTION
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectToDB {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DB Adder");

        // Create components
        JTextField numberField = new JTextField(10);
        JTextField numberField1 = new JTextField(10);

        JButton addButton = new JButton("Add Number");
        JTextArea resultArea = new JTextArea(10, 30);

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    double number1 = Double.parseDouble(numberField.getText());
                    double number2 = Double.parseDouble(numberField1.getText());

                    // Calculate the result
                    double result = number1 + number2;

                    // Add the numbers and result to the result area
                    resultArea.append(number1 + " + " + number2 + " = " + result + "\n");

                    // Store the result in the MySQL database
                    storeResultInDatabase(number1, number2, result);
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(numberField);
        panel.add(numberField1);
        panel.add(addButton);

        // Set up the frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // Connect to the MySQL database and store the result
    private static void storeResultInDatabase(double number1, double number2, double result) {
        String url = "jdbc:mysql://localhost:3306/calculator"; // Replace with your database URL
        String user = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            
            // raw query 
            String sql = "INSERT INTO history (firstnumber, secondnumber, result) VALUES (?, ?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, number1);
            preparedStatement.setDouble(2, number2);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
