import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            sum += arr[i];
        }
        System.out.println("Sum of all array elements : " + sum);

    }

}
