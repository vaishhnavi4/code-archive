import java.util.Scanner;

public class Ascending {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; ++i) {

            for (int j = 0; j < arr.length - 1 - i; ++j) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("----------------Ascending Order----------------");
        for (int i = 0; i < 5; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

}
