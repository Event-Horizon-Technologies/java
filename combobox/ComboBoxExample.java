import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.WindowConstants;

public class ComboBoxExample {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        JPanel panel = new JPanel();

        // Create a JComboBox and add some items
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");

        // Add the JComboBox to the panel
        panel.add(comboBox);

        // Set the frame properties
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}
