import java.util.Scanner;

public class Armstrong {

    public void check(int n) {

        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (temp != 0) {

            int ld = temp % 10;
            sum += Math.pow(ld, digits);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is Armstrong Number");
        else
            System.out.println(n + " is not Armstrong Number");

    }

    public static void main(String[] args) {

        Armstrong a = new Armstrong();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        a.check(n);

        sc.close();
    }
}

/*
 * 2. Armstrong Number
 * Problem:
 * Write a program to check whether a given number n is an Armstrong number or
 * not.
 * 
 * An Armstrong number (also known as a narcissistic number) is one in which the
 * sum of its own digits each raised to the power of the number of digits equals
 * the number itself.
 * Example: 153 = 1� + 5� + 3�
 */