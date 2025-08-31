import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {

        int arr[] = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to be inserted : ");
        int value = sc.nextInt();

        System.out.print("Enter position at element to be inserted : ");
        int pos = sc.nextInt();

        for (int i = 5; i > pos; --i) {

            arr[i] = arr[i - 1];
        }

        arr[pos] = value;

        System.out.println("\n------------Array after insertion---------------");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

/*
 * 
 * declare the array of size 6 and store 5 values in it and last block should be
 * empty
 * a[0] a[1] a[2] a[3] a[4]
 * a[5]
 * 10 20 30 40 50
 * Enter the index on which value want to be insert
 * e.g. index = 2
 * Enter the value which want to store on index
 * Value = 100
 * When we insert the value on index then we need to shift the values from index
 * to next index
 * e.g.
 * a[0] a[1] a[2] a[3] a[4]
 * 10 20 100 30 40 50
 */
