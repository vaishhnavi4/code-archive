import java.util.Scanner;

public class Palindrome {
    public void rev(int n) {

        int temp = n;
        int rev = 0;

        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }

        if (rev == n)
            System.out.println(n + " is Palindrome Number");
        else
            System.out.println(n + " is not Palindrome Number");
    }

    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        p.rev(n);
    }
}
