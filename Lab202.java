import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2;
        int mod = num1 % num2;

        System.out.println("Summation =" + sum);
        System.out.println("Subtraction =" + sub);
        System.out.println("Multiplication =" + mul);
        System.out.println("Division =" + div);
        System.out.println("Modulus =" + mod);
    }
}
