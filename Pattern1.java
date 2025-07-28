import java.util.Scanner;

public class Pattern1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        sc.close();
        // outer loop for rows
        for(int i = 1; i <= rows; i++) {
            //inner loop for columns
            for(int j = 1; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * output - 
 * 
Enter number of rows: 
5
Enter number of columns: 
5
* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *
 */