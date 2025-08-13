import java.util.Scanner;

public class SmallestMissingElement {

    public void find(int a[]) {

        // 0 2 3 4 5 6 7 9
        int smele = -1;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] > 1) {
                smele = a[i] + 1;
                break;
            }
        }

        if (smele != -1) {
            System.out.println("Smallest missing element: " + smele);
        } else {
            System.out.println("No missing elements in the array.");
        }
    }

    public static void main(String[] args) {

        SmallestMissingElement m = new SmallestMissingElement();

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