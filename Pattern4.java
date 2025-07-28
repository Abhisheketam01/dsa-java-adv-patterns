import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // 2 spaces for alignment
            }
            // Then print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}

