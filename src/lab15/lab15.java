package lab15;

import javax.swing.*;
import java.awt.*;

public class lab15 extends JFrame{
    ImageIcon icon = new ImageIcon("D:/College/JavaLabs/logo.png");
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel("Shirash Shrestha");

    JTextField textField = new JTextField();


    public lab15() {

        setTitle("My GUI");
        setIconImage(icon.getImage());
        setLayout(null);

        add(label1);
        add(label2);
        label1.setBounds(10, 10,100,25);
        label2.setBounds(10, 40,100,25);

        add(textField);
        textField.setBounds(120, 50,50,20);
        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
        textField.setToolTipText("Enter your text here");

        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
