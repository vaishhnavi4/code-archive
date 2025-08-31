import java.util.Scanner;

public class LowerTriangle {

    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of the square matrix : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Input elements in the first matrix : ");

        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < n; ++j) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is :");
        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < n; ++j) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Setting zero in lower triangular matrix");
        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < n; ++j) {

                if (i > j) {
                    System.out.print("0 ");
                } else {

                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}

/*
 * Write a program in C to print or display the lower triangular of a given
 * matrix.
 * Test Data :
 * Input the size of the square matrix : 3
 * Input elements in the first matrix :
 * element - [0],[0] : 1
 * element - [0],[1] : 2
 * element - [0],[2] : 3
 * element - [1],[0] : 4
 * element - [1],[1] : 5
 * element - [1],[2] : 6
 * element - [2],[0] : 7
 * element - [2],[1] : 8
 * element - [2],[2] : 9
 * Expected Output :
 * The matrix is :
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Setting zero in lower triangular matrix
 * 1 2 3
 * 0 5 6
 * 0 0 9
 * 
 */
