//✅ Pattern #8: Full Diamond Pattern
// rows = 5
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         * 

import java.util.Scanner;

public class Pattern8_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Top Half (Pyramid)
        for (int i = 1; i <= rows; i++) {
            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom Half (Inverted Pyramid)
        for (int i = rows - 1; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


