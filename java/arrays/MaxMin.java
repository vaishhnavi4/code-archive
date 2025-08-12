import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < 5; ++i) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array : " + max);

        int min = arr[0];
        for (int i = 1; i < 5; ++i) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array : " + min);

    }

}
