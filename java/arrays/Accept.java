import java.util.Scanner;

public class Accept {

    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < arr.length; ++i) {

            arr[i] = sc.nextInt();
        }

        System.out.println("---------Array Elements--------");
        for (int i = 0; i < arr.length; ++i) {

            System.out.print(arr[i] + " ");
        }
    }

}
