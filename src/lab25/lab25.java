package lab25;

import javax.swing.*;
import java.awt.*;

public class lab25 extends JFrame {
    JDesktopPane desktopPane = new JDesktopPane();
    JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1", true, true, true, true);
    JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2", true, true, true, true);

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");

    public lab25() {
        setTitle("Lab 25");

        add(desktopPane);

        internalFrame1.setSize(200, 200);
        internalFrame2.setSize(200, 200);

        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        internalFrame1.setLayout(new FlowLayout(FlowLayout.CENTER));
        internalFrame2.setLayout(new FlowLayout(FlowLayout.CENTER));
        internalFrame1.add(button1);
        internalFrame2.add(button2);

        internalFrame1.setVisible(true);
        internalFrame2.setVisible(true);

        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
