import java.util.Scanner;

public class GcdLcm {

    public int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {

        GcdLcm o = new GcdLcm();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = o.findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

    }
}

/*
 * GCD and LCM of Two Numbers
 * Problem:
 * Write a program to find the Greatest Common Divisor (GCD) and Least Common
 * Multiple (LCM) of two given integers a and b.
 * 
 */