import java.util.Scanner;

public class RightDiagonalSum {

    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of the square matrix : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < n; ++j) {

                System.out.print("element - [" + i + "][" + j + "] : ");
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

        int sum = 0;
        for (int i = 0; i < n; ++i) {

            sum += arr[i][n - i - 1];
        }

        System.out.println("Addition of the right Diagonal elements is : " + sum);

    }

}

/*
 * Write a program in C to find sum of right diagonals of a matrix
 * Test Data :
 * Input the size of the square matrix : 2
 * Input elements in the first matrix :
 * element - [0],[0] : 1
 * element - [0],[1] : 2
 * element - [1],[0] : 3
 * element - [1],[1] : 4
 * Expected Output :
 * The matrix is :
 * 1 2
 * 3 4
 * Addition of the right Diagonal elements is :5
 */
