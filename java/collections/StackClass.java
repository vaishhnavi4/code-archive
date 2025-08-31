package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int ch;

        do {
            System.out.println("\n1.Push");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Exit");

            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Element to Push : ");
                    int ele = sc.nextInt();
                    s.push(ele);
                    break;

                case 2:
                    if (s.isEmpty())
                        System.out.println("Stack Underflow");
                    else
                        System.out.println(s);

                    break;

                case 3:
                    System.out.print("Enter element to search : ");
                    int searchele = sc.nextInt();

                    if (s.search(searchele) != -1)
                        System.out.println("Element Found!!");
                    else
                        System.out.println("Element not Found!!");

                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        } while (ch != 4);
    }

}
