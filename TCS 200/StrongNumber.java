import java.util.Scanner;

public class StrongNumber {

    // Method to find factorial
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is NOT a Strong Number");
        }

        sc.close();
    }
}
