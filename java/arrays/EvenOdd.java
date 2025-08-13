import java.util.Scanner;

public class EvenOdd {

    public void separate(int a[]) {

        int ecount = 0, ocount = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
        }

        int even[] = new int[ecount];
        int odd[] = new int[ocount];

        int eindex = 0, oindex = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                even[eindex++] = a[i];

            } else {
                odd[oindex++] = a[i];
            }
        }

        System.out.println("Even elements are : ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd elements are : ");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
    }

    public static void main(String[] args) {

        EvenOdd e = new EvenOdd();

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        e.separate(a);

    }
}

// Write a program to separate odd and even integers in separate arrays