import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        int i = 0;
        System.out.print("Enter array elements : ");
        for (i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;

        int count = 1;

        for (i = 1; i < arr.length; ++i) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.printf("%d--->%d\n", arr[i - 1], count);
                count = 1;
            }
        }

        System.out.printf("%d--->%d\n", arr[i - 1], count);

    }

}
