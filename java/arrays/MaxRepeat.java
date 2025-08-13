import java.util.Scanner;

public class MaxRepeat {

    public void findMaxRepeat(int a[]) {

        int maxcount = 0;
        int maxElement = a[0];

        for (int i = 0; i < a.length; ++i) {

            int count = 0;

            for (int j = 0; j < a.length; ++j) {

            }

        }
    }

    public static void main(String[] args) {

        MaxRepeat m = new MaxRepeat();

        int a[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        m.findMaxRepeat(a);
    }

}

// Write a program to find the maximum repeating number in a given array
