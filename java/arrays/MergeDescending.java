import java.util.Scanner;

public class MergeDescending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[3];
        System.out.print("Enter array1 elements : ");
        for (int i = 0; i < 3; ++i) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[3];
        System.out.print("Enter array2 elements : ");
        for (int i = 0; i < 3; ++i) {
            arr2[i] = sc.nextInt();
        }

        int n = arr1.length + arr2.length;
        int merge[] = new int[n];

        // Time Complexity O(n)
        /*
         * for (int i = 0; i < arr1.length; ++i) {
         * merge[i] = arr1[i];
         * }
         * 
         * for (int i = 0; i < arr2.length; ++i) {
         * merge[arr1.length + i] = arr2[i];
         * }
         */

        // Two Pointer Approach

        for (int i = 0, k = arr1.length; i < arr1.length; i++, k++) {

            merge[i] = arr1[i];
            merge[k] = arr2[i];

        }

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {

                if (merge[i] < merge[j]) {

                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

        System.out.println("---------------Merged and Sorted Descending-------------");
        for (int i = 0; i < n; ++i) {
            System.out.print(merge[i] + " ");
        }

    }

}
