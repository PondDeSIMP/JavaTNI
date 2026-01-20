import java.util.Scanner;

public class StudentMain {
    public static void showInfo(Student st) {
        System.out.println("Name : " + st.getName());
        System.out.println("Year : " + st.getStudyYear());
        System.out.println("Score: " + st.getScore());
        System.out.println("Grade : " + st.getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("Enter student name  : ");
        st.setName(sc.next());
        System.out.print("Enter student year  : ");
        st.setStudyYear(sc.nextInt());
        System.out.print("Enter mid-term score: ");
        st.addPoint(sc.nextInt());
        System.out.print("Enter final score   : ");
        st.addPoint(sc.nextInt());
        System.out.println("------------------------------------------");
        showInfo(st);
    }
}
