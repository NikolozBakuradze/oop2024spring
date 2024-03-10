import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double min = input.nextDouble();
        double seconds = min * 60;
        System.out.println("Number of seconds is "+seconds);
        input.close();
    }
}
