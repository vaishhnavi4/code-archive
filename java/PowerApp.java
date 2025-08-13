import java.util.Scanner;

class Power {

    private int base;
    private int exponent;

    public void setValue(int x, int y) {
        this.base = x;
        this.exponent = y;
    }

    public void getValue() {

        // Using inbulid Math.pow
        // double result = Math.pow(base, exponent);

        // Using Logic
        int result = 1;
        for (int i = 1; i <= exponent; ++i) {
            result *= base;
        }

        System.out.println(base + " raised to " + exponent + " is : " + result);
    }
}

public class PowerApp {

    public static void main(String[] args) {

        Power p = new Power();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base : ");
        int x = sc.nextInt();

        System.out.print("Enter Exponent : ");
        int y = sc.nextInt();

        p.setValue(x, y);
        p.getValue();

        sc.close();

    }

}
