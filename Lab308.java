import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int count = scanner.nextInt();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");

            int number = scanner.nextInt();

            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        scanner.close();
        System.out.println("\nMaximum = " + maximum);
        System.out.println("Minimum = " + minimum);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);
    }
}