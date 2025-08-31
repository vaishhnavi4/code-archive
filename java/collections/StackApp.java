package collections;

import java.util.Scanner;

class Stack1 {

    int a[], top, max;

    Stack1() {

        top = -1;
        a = new int[5];
        max = a.length;
    }

    void push(int ele) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");

        } else {

            top++;
            a[top] = ele;
        }
    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");

        } else {
            System.out.println("Popped Element : " + top);
            top--;
        }
    }

    void display() {

        if (top == -1) {
            System.out.println("Stack Underflow");

        } else {

            for (int i = top; i >= 0; --i) {
                System.out.println(a[i]);
            }
        }
    }

}

public class StackApp {

    public static void main(String[] args) {

        Stack1 s = new Stack1();

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
                    s.display();

                    break;

                case 3:
                    s.pop();

                    break;

                // case 3:
                // System.out.print("Enter element to search : ");
                // int searchele = sc.nextInt();

                // if (s.search(searchele) != -1)
                // System.out.println("Element Found!!");
                // else
                // System.out.println("Element not Found!!");

                // break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        } while (ch != 4);
    }

}
