import java.util.Scanner;

public class RotateFromPosition {

    public void rotate(int a[], int pos) {

        for (int i = 0; i <= pos; ++i) {

        }

    }

    public static void main(String[] args) {

        int a[] = new int[11];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter position from where to rotate : ");
        int pos = sc.nextInt();

        RotateFromPosition r = new RotateFromPosition();

        r.rotate(a, pos);

    }
}
