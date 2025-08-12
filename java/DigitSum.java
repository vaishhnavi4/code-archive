public class DigitSum {

    public int sum(int n) {

        int s = 0;

        int temp = n;
        while (temp != 0) {

            int ld = temp % 10;
            s = s + ld;
            temp /= 10;
        }
        return s;
    }

    public static void main(String[] args) {

        DigitSum d = new DigitSum();

        System.out.println("Sum of digits : " + d.sum(234));
    }

}

/*
 * Sum of Digits
 * Problem:
 * Write a program to find the sum of the digits of a given number n.
 * e.g 234 -> 2 + 3 + 4 = 9
 */