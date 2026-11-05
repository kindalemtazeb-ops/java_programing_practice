import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    public static void main(String[] args) {
        // የ ዋናው መስኮት (JFrame) መፍጠር
        JFrame frame = new JFrame("Java Swing All-in-One Demo");
        frame.setSize(450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 1. JMenu (የሜኑ μና)
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // 2. JComboBox (ተዘርግቶ የሚመረጥ ዝርዝር)
        String[] countries = {"ኢትዮጵያ (Ethiopia)", "ኬንያ (Kenya)", "አሜሪካ (USA)"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.setBounds(30, 30, 200, 30);
        frame.add(comboBox);

        // 3. JCheckBox (ምልክት ማድረጊያ)
        JCheckBox checkBox = new JCheckBox("ውጤቱን በኢሜይል ላክ (Send via Email)");
        checkBox.setBounds(30, 80, 300, 30);
        frame.add(checkBox);

        // 4. JList (የዝርዝር ማሳያ)
        String[] languages = {"Java", "PHP", "Python", "JavaScript"};
        JList<String> list = new JList<>(languages);
        list.setBounds(30, 130, 200, 80);
        frame.add(new JScrollPane(list)); // ከስክሮል ጋር እንዲሆን

        // 5. JTextArea (ባለ ብዙ መስመር የጽሁፍ ማቀናበሪያ)
        JTextArea textArea = new JTextArea();
        JScrollPane textScroll = new JScrollPane(textArea);
        textScroll.setBounds(30, 230, 350, 100);
        frame.add(textScroll);

        // 6. JButton (ውጤቱን ለማየት የሚረዳ ቁልፍ) እና JOptionPane (የብቅ ባይ መልዕክት መስኮት)
        JButton submitButton = new JButton("መረጃ ላክ (Submit)");
        submitButton.setBounds(30, 350, 150, 35);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ተጠቃሚው የመረጣቸውን እና የጻፋቸውን መረጃዎች መሰብሰብ
                String selectedCountry = (String) comboBox.getSelectedItem();
                boolean isChecked = checkBox.isSelected();
                String selectedLang = list.getSelectedValue();
                String typedText = textArea.getText();

                // መረጃውን ለማሳየት የ JOptionPane መልዕክት ሳጥን መጠቀም
                String message = "ሀገር: " + selectedCountry + 
                                 "\nኢሜይል ተመርጧል: " + (isChecked ? "አዎ" : "አይደለም") + 
                                 "\nቋንቋ: " + (selectedLang != null ? selectedLang : " አልተመረጠም") +
                                 "\nማስታወሻ: " + typedText;

                JOptionPane.showMessageDialog(frame, message, "የተሰበሰበ መረጃ (Result)", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // መስኮቱን እንዲታይ ማድረግ
        frame.setVisible(true);
    }
}