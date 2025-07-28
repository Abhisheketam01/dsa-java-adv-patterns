// ✅ Pattern #7: Inverted Right-Aligned Triangle
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 


import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = rows; i >= 1; i--) {
            // Print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



