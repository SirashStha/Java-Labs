package lab21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab21 {

    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenu submenu, radioSubmenu, checkboxSubmenu;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem radioMenuItem, radioButtonMenuItem2, radioButtonMenuItem3;
    private JCheckBoxMenuItem checkMenuItem, checkBoxMenuItem2,checkBoxMenuItem3;

    public lab21(){
        //Create the frame
        frame = new JFrame("Lab 21");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create the menu bar
        menuBar = new JMenuBar();

        //Create a menu
        menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_M);
        menuBar.add(menu);

        //Create a submenu
        submenu = new JMenu("Submenu");
        radioSubmenu = new JMenu("Radio Submenu");
        checkboxSubmenu = new JMenu("Checkbox Submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        //Create a menu item
        menuItem = new JMenuItem("Menu Item");
        menuItem.setMnemonic(KeyEvent.VK_I);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Menu Item clicked"));
        menu.add(menuItem);

        menu.add(radioSubmenu);
        menu.add(checkboxSubmenu);

        //Create a radio button menu item
        radioMenuItem = new JRadioButtonMenuItem("Radio Button Menu Item");
        radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio Button Menu Item 2");
        radioButtonMenuItem3 = new JRadioButtonMenuItem("Radio Button Menu Item 3");
        radioMenuItem.setMnemonic(KeyEvent.VK_R);
        radioMenuItem.setSelected(true);
        radioSubmenu.add(radioMenuItem);
        radioSubmenu.add(radioButtonMenuItem2);
        radioSubmenu.add(radioButtonMenuItem3);

        //Create a checkbox menu item
        checkMenuItem = new JCheckBoxMenuItem("Check Box Menu Item");
        checkBoxMenuItem2 = new JCheckBoxMenuItem("Check Box Menu Item 2");
        checkBoxMenuItem3 = new JCheckBoxMenuItem("Check Box Menu Item 3");
        checkMenuItem.setMnemonic(KeyEvent.VK_C);
        checkboxSubmenu.add(checkMenuItem);
        checkboxSubmenu.add(checkBoxMenuItem2);
        checkboxSubmenu.add(checkBoxMenuItem3);

        //Add submenu to menu
        menu.add(submenu);

        //Create another menu item in the submenu
        menuItem = new JMenuItem("Another Menu Item");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        //Add an icon to the menu
        ImageIcon icon = new ImageIcon("open.png");
        menu.setIcon(icon);

        //Disable a menu item
        menuItem.setEnabled(false);

        //Add the menu bar to the frame
        frame.setJMenuBar(menuBar);

        //Display the frame
        frame.setSize(600,600);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new lab21());
    }
}
