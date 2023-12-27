package cse557;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IntegerDivisionCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public IntegerDivisionCalculator() {
        setTitle("Integer Division Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel num1Label = new JLabel("Num1:");
        JLabel num2Label = new JLabel("Num2:");
        JLabel  resultLabel = new JLabel("Result:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton divideButton = new JButton("Divide");
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }

        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDivision();
            }
        });
        setLayout(new GridLayout(4, 2));
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); 
        add(divideButton);
        setVisible(true);
    }

    private void performDivision() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Number format Exception", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, "Arithmetic Exception.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {     
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IntegerDivisionCalculator();
            }
        });
    }
}

