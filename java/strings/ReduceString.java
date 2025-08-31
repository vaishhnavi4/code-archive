import java.util.Scanner;

public class ReduceString {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0, count = 1;
        for (i = 1; i < s.length(); ++i) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;

            } else {
                System.out.print(s.charAt(i - 1) + "" + count);
                count = 1;
            }
        }
        System.out.print(s.charAt(i - 1) + "" + count);

    }
}

/*
 * Capgemini in its online written test have a coding question, wherein the
 * students are given a string with multiple
 * characters that are repeated consecutively. You’re supposed to reduce the
 * size of this string using mathematical logic
 * given as in the example below :
 * 
 * Input :
 * aabbbbeeeeffggg
 * 
 * Output:
 * a2b4e4f2g3
 * 
 * Input :
 * abbccccc
 * 
 * Output:
 * ab2c5
 * 
 */