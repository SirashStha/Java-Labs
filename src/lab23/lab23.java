package lab23;

import javax.swing.*;
import java.awt.*;
public class lab23 extends JFrame {
    JToolBar toolbar = new JToolBar();
    JButton modalDialogButton = new JButton("Modal Dialog");
    JButton modelessDialogButton = new JButton("Modeless Dialog");
    JLabel modalLabel = new JLabel("This is inside modal dialog");
    JLabel modalLessLable = new JLabel("This is inside modal less dialog");
    public lab23() {
        setTitle("Lab 23");

        add(toolbar, BorderLayout.NORTH);

        toolbar.add(modalDialogButton);
        toolbar.add(modelessDialogButton);

        modalDialogButton.addActionListener(modal -> {
            JDialog modalDialog = new JDialog(lab23.this, "Modal Dialog", true);
            modalDialog.setSize(400, 300);
            modalDialog.setVisible(true);
        });

        modelessDialogButton.addActionListener(modalLess -> {
            JDialog modelessDialog = new JDialog(lab23.this, "Modeless Dialog", false);
            modelessDialog.setSize(400, 300);
            modelessDialog.setVisible(true);
        });

        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
