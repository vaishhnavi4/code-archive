import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {

        int arr[] = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        System.out.print("Enter element to be inserted : ");
        int value = sc.nextInt();

        System.out.print("Enter position at element to be inserted : ");
        int pos = sc.nextInt();

        for (int i = 5; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;

        System.out.println("Array after insertion: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
