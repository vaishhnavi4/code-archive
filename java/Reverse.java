import java.util.Scanner;

public class Reverse {
    public void rev(int n) {
        int rev = 0;

        while (n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }

        System.out.println("Reversed the Number --> " + rev);
    }

    public static void main(String[] args) {

        Reverse r = new Reverse();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        r.rev(n);
    }
}

/*
 * Reverse a Number
 * Problem:
 * Write a program that reverses the digits of a given integer n.
 * 
 * Example: Input: 1234 → Output: 4321
 */