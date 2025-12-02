import javax.swing.JOptionPane;

public class Lab302{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your name:");
        String heightStr = JOptionPane.showInputDialog("Input your height(cm):");
        double height = Double.parseDouble(heightStr);
        double stdWeight = 0;
        String resultMessage = "";
        int maleOption = JOptionPane.showConfirmDialog(
                null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (maleOption == JOptionPane.YES_OPTION) {
            stdWeight = height - 100.0;

            resultMessage = String.format(
                    "Hello, %s\nIf your height is %.1f cm.\nYour weight should be %.1f kg.",
                    name,
                    height,
                    stdWeight
            );
            JOptionPane.showMessageDialog(null, resultMessage, "Message", JOptionPane.INFORMATION_MESSAGE);

        } else if (maleOption == JOptionPane.NO_OPTION) {
            int femaleOption = JOptionPane.showConfirmDialog(
                    null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (femaleOption == JOptionPane.YES_OPTION) {
                stdWeight = height - 110.0;

                resultMessage = String.format(
                        "Hello, %s\nIf your height is %.1f cm.\nYour weight should be %.1f kg.",
                        name,
                        height,
                        stdWeight
                );
                JOptionPane.showMessageDialog(null, resultMessage, "Message", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "You can use BMI to measure your weight and height.",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "You can use BMI to measure your weight and height.",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}