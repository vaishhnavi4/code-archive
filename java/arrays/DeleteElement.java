import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        System.out.print("Input the position where to delete:");
        int pos = sc.nextInt();

        for (int i = pos; i < n - 1; ++i) {
            arr[i] = arr[i + 1];
        }
        n--;

        System.out.println("New Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

/*
 * Write a program in C to delete an element at desired position from an array.
 * Test Data :
 * Input the size of array : 5
 * Input 5 elements in the array in ascending order:
 * element - 0 : 1
 * element - 1 : 2
 * element - 2 : 3
 * element - 3 : 4
 * element - 4 : 5
 * Input the position where to delete: 3
 * Expected Output :
 * The new list is : 1 2 4 5
 *
 */
