import javax.swing.*;
import java.util.Scanner;

public class StudentMain2 {
    public static void main(String[] args) {
        Student[] st = new Student[10];

        for (int i=0; i<st.length; i++){
            st[i] = new Student();

            //System.out.print("Enter student name: ");
            st[i].name = JOptionPane.showInputDialog("Enter student name: ");

            //System.out.print("Enter student id: ");
            st[i].id = JOptionPane.showInputDialog("Enter student id: ");

            //System.out.print("Enter homework score: ");
            st[i].doHomework(Integer.parseInt(
                    JOptionPane.showInputDialog("Enter homework score: ")));

            //System.out.print("Enter exam score: ");
            st[i].takeExam(Integer.parseInt(
                    JOptionPane.showInputDialog("Enter exam score: ")));
        }

        for (Student s : st){
            System.out.println();
            s.showstatus();
        }
    }
}
