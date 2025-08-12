import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.print("Enter position at element to be inserted : ");
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
