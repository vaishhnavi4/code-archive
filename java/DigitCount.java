public class DigitCount {

    public int count(int n) {

        int cnt = 0;

        int temp = n;
        while (temp != 0) {

            temp /= 10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

        DigitCount d = new DigitCount();

        System.out.println("Digit Count : " + d.count(1278));
    }
}

/*
 * Count Digits in a Number
 * Problem:
 * Write a program to count the number of digits in a given number n.
 * e.g 5674 -> digit count = 4
 */