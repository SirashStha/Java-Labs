package lab23;

import javax.swing.*;
import java.awt.*;
public class lab23 extends JFrame {
    JToolBar toolbar = new JToolBar();
    JButton modalDialogButton = new JButton("Modal Dialog");
    JButton modalLessDialogButton = new JButton("Modeless Dialog");
    JLabel modalLabel = new JLabel("This is inside modal dialog");
    JLabel modalLessLabel = new JLabel("This is inside modal less dialog");
    public lab23() {
        setTitle("Lab 23");

        add(toolbar, BorderLayout.NORTH);

        toolbar.add(modalDialogButton);
        toolbar.add(modalLessDialogButton);

        modalDialogButton.addActionListener(modal -> {
            JDialog modalDialog = new JDialog(lab23.this, "Modal Dialog", true);
            modalDialog.setSize(400, 300);
            modalDialog.add(modalLabel);
            modalDialog.setVisible(true);
        });

        modalLessDialogButton.addActionListener(modalLess -> {
            JDialog modalLessDialog = new JDialog(lab23.this, "ModalLess Dialog", false);
            modalLessDialog.setSize(400, 300);
            modalLessDialog.add(modalLessLabel);
            modalLessDialog.setVisible(true);
        });

        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new lab23();
    }
}
