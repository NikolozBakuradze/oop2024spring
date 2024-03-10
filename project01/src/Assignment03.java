import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextFloat();
        double area = radius * radius * Math.PI;
        System.out.print("The area of the circle is "+ area);
        input.close();


    }
}
