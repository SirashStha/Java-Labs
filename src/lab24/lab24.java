package lab24;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab24 extends JFrame {
    JButton fileChooserButton = new JButton("File Chooser");
    JButton colorChooserButton = new JButton("Color Chooser");
    public lab24() {
        setTitle("Lab 24");
        setLayout(new FlowLayout(FlowLayout.CENTER));


        add(fileChooserButton);
        add(colorChooserButton);

        fileChooserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select a file");
                fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
                int returnVal = fileChooser.showOpenDialog(lab24.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    // do something with the selected file
                }
            }
        });

        colorChooserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(lab24.this, "Select a color", Color.BLACK);
                if (selectedColor != null) {
                    // do something with the selected color
                }
            }
        });

        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
