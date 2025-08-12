import java.util.Scanner;

public class SecondSmallest {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        for (int i = 0; i < n; ++i) {

            for (int j = i + 1; j < n; ++j) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Second Largest Element : " + arr[1]);

    }

}
