import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int total_minute = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Input minutes:",
                JOptionPane.QUESTION_MESSAGE));

        int hour = total_minute / 60;
        int minute = total_minute % 60;

        JOptionPane.showMessageDialog(null,
                total_minute + "minutes is " + hour + " hour " + minute + " minutes");
    }
}
