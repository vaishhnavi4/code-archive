import java.util.Scanner;

public class Ascending {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; ++i) {

            for (int j = i + 1; j < 5; ++j) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("----------------Ascending Order----------------");
        for (int i = 0; i < 5; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

}
