import java.util.Scanner;

public class MissingElement {

    public void find(int a[]) {

        System.out.println("Missing Elements : ");

        for (int i = 0; i < a.length - 1; ++i) {

            for (int j = a[i] + 1; j < a[i + 1]; ++j) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {

        MissingElement m = new MissingElement();

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements in ascending : ");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        m.find(a);
    }
}

// Write a program to enter the 5 values in ascending order and store in array
// and find out the missing element from array