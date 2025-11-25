import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input hour : ");
        int hour = scanner.nextInt();
        System.out.println("input minute : ");
        int minute = scanner.nextInt();

        System.out.println("Total time is " + ((hour * 60) + minute) + "minutes");
    }
}
