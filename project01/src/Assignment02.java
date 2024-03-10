import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();
        input.close();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
    }
}
