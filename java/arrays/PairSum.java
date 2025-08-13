import java.util.Scanner;

public class PairSum {

    public void findpair(int a[], int sum) {

        for (int i = 0; i < a.length; ++i) {

            for (int j = i + 1; j < a.length; ++j) {

                if (a[i] + a[j] == sum) {
                    System.out.println("Pair that makes up the sum : " + a[i] + " " + a[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        PairSum p = new PairSum();

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the sum : ");
        int sum = sc.nextInt();

        p.findpair(a, sum);

    }

}

// Write a program to find a pair with given sum in the array