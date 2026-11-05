import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    public static void main(String[] args) {
        // Create the main window frame
        JFrame frame = new JFrame("Java Swing All-in-One Demo");
        frame.setSize(450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 1. JMenu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // 2. JComboBox
        String[] countries = {"Ethiopia", "Kenya", "USA"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.setBounds(30, 30, 200, 30);
        frame.add(comboBox);

        // 3. JCheckBox
        JCheckBox checkBox = new JCheckBox("Send via Email");
        checkBox.setBounds(30, 80, 300, 30);
        frame.add(checkBox);

        // 4. JList
        String[] languages = {"Java", "PHP", "Python", "JavaScript"};
        JList<String> list = new JList<>(languages);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setBounds(30, 130, 200, 80);
        frame.add(listScroll);

        // 5. JTextArea
        JTextArea textArea = new JTextArea();
        JScrollPane textScroll = new JScrollPane(textArea);
        textScroll.setBounds(30, 230, 350, 100);
        frame.add(textScroll);

        // 6. JButton and JOptionPane
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(30, 350, 150, 35);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Collect selected inputs
                String selectedCountry = (String) comboBox.getSelectedItem();
                boolean isChecked = checkBox.isSelected();
                String selectedLang = list.getSelectedValue();
                String typedText = textArea.getText();

                // Format the message for JOptionPane popup
                String message = "Country: " + selectedCountry + 
                                 "\nEmail Selected: " + (isChecked ? "Yes" : "No") + 
                                 "\nLanguage: " + (selectedLang != null ? selectedLang : "Not Selected") +
                                 "\nNote: " + typedText;

                JOptionPane.showMessageDialog(frame, message, "Submitted Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}