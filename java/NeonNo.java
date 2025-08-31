import java.util.Scanner;

public class NeonNo {

    public void check(int n) {

        int sum = 0;
        int sq = n * n;

        while (sq != 0) {

            int ld = sq % 10;
            sum = sum + ld;
            sq = sq / 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Neon Number!!");
        } else {
            System.out.println(n + " not a Neon Number!!");
        }

    }

    public static void main(String[] args) {

        NeonNo nn = new NeonNo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no to be checked as Neon Number : ");
        int n = sc.nextInt();
        nn.check(n);
    }
}