package lab22;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class lab22 extends JFrame {

    private JList<String> list;
    private DefaultTableModel tableModel;
    private JTable table;
    private JProgressBar progressBar;
    private JTree tree;
    private JSlider slider;

    public lab22() {
        initUI();
    }

    private void initUI() {
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Add a slider to the panel
        slider = new JSlider();
        slider.addChangeListener(new SliderChangeListener());
        panel.add(slider, BorderLayout.NORTH);

        // Add a list to the panel
        list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"});
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected item: " + list.getSelectedValue());
                }
            }
        });
        JScrollPane listScrollPane = new JScrollPane(list);
        panel.add(listScrollPane, BorderLayout.WEST);

        // Add a table to the panel
        tableModel = new DefaultTableModel(new Object[][]{{"1", "2"}, {"3", "4"}}, new String[]{"Column 1", "Column 2"});
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        panel.add(tableScrollPane, BorderLayout.CENTER);

        // Add a progress bar to the panel
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        panel.add(progressBar, BorderLayout.SOUTH);

        // Add a tree to the panel
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        rootNode.add(node1);
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        rootNode.add(node2);
        DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
        tree = new JTree(treeModel);
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (node == null) return;
                System.out.println("Selected node: " + node.getUserObject());
            }
        });
        JScrollPane treeScrollPane = new JScrollPane(tree);
        panel.add(treeScrollPane, BorderLayout.EAST);

        // Set the panel as the content pane of the frame
        setContentPane(panel);

        // Set frame properties
        setTitle("Swing GUI Example");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class SliderChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            if (!source.getValueIsAdjusting()) {
                System.out.println("Slider value: " + source.getValue());
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            lab22 ex = new lab22();
            ex.setVisible(true);
        });
    }
}
