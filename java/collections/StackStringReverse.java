package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            st.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!st.isEmpty()) {
            reversed.append(st.pop());
        }

        System.out.println("Reversed string: " + reversed);

    }

}
