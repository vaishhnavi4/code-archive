import java.util.Scanner;

public class Primeornot {

    public boolean check(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Primeornot p = new Primeornot();

        System.out.print("Enter a number to check prime : ");
        int n = sc.nextInt();

        if (p.check(n))
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");

        sc.close();

    }
}