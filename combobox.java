import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class combobox extends JFrame implements ActionListener {
    JComboBox<String> comboBox;
    JLabel label;

    public combobox() {
        setTitle("ComboBox Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JComboBox comboBox = new JComboBox<>(items);
    comboBox.addActionListener(this);

        label = new JLabel("Select an item from the combo box.");

        add(comboBox);
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedItem = (String) comboBox.getSelectedItem();
        label.setText("Selected: " + selectedItem);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            combobox frame = new combobox();
            frame.setVisible(true);
        });
    }
}