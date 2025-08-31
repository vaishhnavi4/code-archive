import java.util.Scanner;

public class Majority {

    public static void main(String[] args) {

        int arr[] = new int[6];

        Scanner sc = new Scanner(System.in);

        int majority = -1;

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; ++i) {
            int count = 0;

            for (int j = 0; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                majority = arr[i];
                break;
            }
        }

        if (majority == -1) {
            System.out.println("There are no Majority Elements in the given array.");
        } else {
            System.out.println("The Majority Element is: " + majority);
        }

    }

}
