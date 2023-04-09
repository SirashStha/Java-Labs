package lab15;

import javax.swing.*;
import java.awt.*;

public class q15 {

    public static void main(String[] args) {
        JFrame f = new JFrame("My Swing GUI");
        f.setIconImage(new ImageIcon("my_icon.png").getImage());

        JLabel nameLabel = new JLabel("Shirash Shrestha");
        nameLabel.setIcon(new ImageIcon("open.png"));

        JTextField tf = new JTextField();
        tf.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        tf.setToolTipText("Enter text here");

        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JCheckBox cb = new JCheckBox("Checkbox");

        JPasswordField pw = new JPasswordField();

        JRadioButton r1 = new JRadioButton("Radio 1");
        JRadioButton r2 = new JRadioButton("Radio 2");
        ButtonGroup rg = new ButtonGroup();
        rg.add(r1);
        rg.add(r2);

        JButton btn = new JButton("Click Me");

        JComboBox<String> cbx = new JComboBox<>(new String[] { "Option 1", "Option 2", "Option 3" });

        JPanel panel = new JPanel(new GridLayout(9, 1));
        panel.add(nameLabel);
        panel.add(tf);
        panel.add(sp);
        panel.add(cb);
        panel.add(pw);
        panel.add(r1);
        panel.add(r2);
        panel.add(btn);
        panel.add(cbx);

        f.getContentPane().add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}

