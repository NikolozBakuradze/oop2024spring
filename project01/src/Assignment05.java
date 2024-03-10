import java.util.Scanner;
public class Assignment05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many levels should the triangle have ? ");
        int height = input.nextInt();

        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}