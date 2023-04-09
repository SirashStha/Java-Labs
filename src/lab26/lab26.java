package lab26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.*;

public class lab26 extends JFrame {
    JButton button1 = new JButton("Information");
    JButton button2 = new JButton("Question");
    JButton button3 = new JButton("Error");
    JButton button4 = new JButton("Warning");
    JButton button5 = new JButton("Confirm");
    JButton button6 = new JButton("Input");
    JButton button7 = new JButton("Option");

    ActionListener actionListener = e -> {
        if (e.getSource().equals(button1)) {
            JOptionPane.showMessageDialog(lab26.this, "Simple Information Message");
        }

        if (e.getSource().equals(button2)) {
            JOptionPane.showMessageDialog(lab26.this,"Are You Sure?","Question",QUESTION_MESSAGE);
        }

        if (e.getSource().equals(button3)) {
            JOptionPane.showMessageDialog(lab26.this, "Uh-Oh!","Error", ERROR_MESSAGE);
        }

        if (e.getSource().equals(button4)) {
            JOptionPane.showMessageDialog(lab26.this, "Warning Message", "Alert", WARNING_MESSAGE);
        }

        if (e.getSource().equals(button5)) {
            JOptionPane.showConfirmDialog(lab26.this,"Do you want to continue?");
        }

        if (e.getSource().equals(button6)) {
            String msg = JOptionPane.showInputDialog(lab26.this,"Anyone there?");
            JOptionPane.showMessageDialog(lab26.this,"Hello "+msg);
        }

        if (e.getSource().equals(button7)) {
            String[] options = {"Rock", "Paper", "Scissors"};
            var selection = JOptionPane.showOptionDialog(lab26.this, "Select one:", "Let's play a game!",
                    0, 3, null, options, options[0]);
            if (selection == 0) {
                JOptionPane.showMessageDialog(null, "You chose rock!");
            }
            if (selection == 1) {
                JOptionPane.showMessageDialog(null, "You chose paper.");
            }
            if (selection == 2) {
                JOptionPane.showMessageDialog(null, "You chose scissors!");
            }
        }
    };


    public lab26() {
        setTitle("Lab 26");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        button6.addActionListener(actionListener);
        button7.addActionListener(actionListener);

    }

    public static void main(String[] args) {
        new lab26();
    }
}
