package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHM {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();

        l.put(1, "Apple");
        l.put(2, "Mango");
        l.put(3, "Grapes");
        l.put(4, "Litchi");
        l.put(5, "Blueberry");

        for (Map.Entry<Integer, String> i : l.entrySet()) {
            System.out.println("Key : " + i.getKey() + " Value : " + i.getValue());
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ");
        int search = sc.nextInt();

    }

}
