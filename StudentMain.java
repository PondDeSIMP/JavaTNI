public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Malee";
        s1.id = "251310001";

        s1.doHomework(15);
        s1.showstatus();

        s1.takeExam(15);
        s1.showstatus();

        Student s2 = new Student();


    }
}
