import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {

        int number = 0;
        boolean is_loop = true;

        while (is_loop) {
            try {
                String input = JOptionPane.showInputDialog("Input an integer number: ");
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Program terminated.");
                    System.exit(0);
                }

                number = Integer.parseInt(input);
                is_loop = false;

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null,
                        "Error: Please enter only integers.\n(" + err.getMessage() + ")",
                        "Error Message", JOptionPane.WARNING_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "You inputted number = " + number);
    }
}