import java.util.Scanner;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        // Time o(n) Space O(1) Best Approach

        int count = 0;

        for (int i = 0; i < arr.length; ++i) {

            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }

        System.out.println("After Moving Zeros To The End");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Using an extra array (Simplest logic, O(n) space)
        // not recommended as extra space is taken

        /*
         * int newarr[] = new int[arr.length];
         * 
         * int index = 0;
         * for (int i : arr) {
         * 
         * if (i != 0) {
         * newarr[index++] = i;
         * //just get the not zeros in new array the remaining is by default 0
         * 
         * }
         * }
         * 
         * System.out.println("After Moving Zeros To The End");
         * for (int i = 0; i < arr.length; ++i) {
         * System.out.print(newarr[i] + " ");
         * }
         */

    }

}
