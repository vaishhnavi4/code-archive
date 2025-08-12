import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;

        // This is just printing the values in reverse
        /*
         * System.out.println("----------Reverse Array-------");
         * for (int i = 4; i >= 0; i--) {
         * System.out.print(arr[i] + " ");
         * }
         */

        // Reversed within the memory location
        int start = 0;
        int end = n - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("------------Reverse Array-----------");

        for (int i = 0; i < n; ++i) {

            System.out.print(arr[i] + " ");
        }

    }

}
