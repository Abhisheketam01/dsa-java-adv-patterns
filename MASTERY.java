//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

import java.util.Scanner;

public class DoubleSidedArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int sp = 1; sp <= (n - i) * 2; sp++) {
                System.out.print(" ");
            }

            // Print decreasing numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------
OUTPUT NO.2
          1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
  
CODE 
  import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            // Print leading spaces for center alignment
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num); // %4d for spacing
                num = num * (i - j) / (j + 1); // Efficient nCr formula
            }
            System.out.println();
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------

  NO.3 OUTPUT 
 1   2   3   4   5
16  17  18  19   6
15  24  25  20   7
14  23  22  21   8
13  12  11  10   9

  INPUT 
  import java.util.Scanner;

public class SpiralMatrixPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n x n): ");
        int n = sc.nextInt();
        sc.close();

        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------

  NO.4 
OUTPUT 
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

CODE 
import java.util.Scanner;

public class SymmetricHourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // Upper half
        for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }
            // Increasing numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            // Decreasing numbers
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower half (mirror)
        for (int i = n - 2; i >= 0; i--) {
            // Leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }
            // Increasing numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            // Decreasing numbers
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------
  NO.5
  
*       *       *
  *   *   *   *  
    *       *    
  *   *   *   *  
*       *       *
  
  CODE
  import java.util.Scanner;

public class ZigzagDiagonalStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        int cols = rows * 2 - 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------
  NO.6
  
  

  

  

  
