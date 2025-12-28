import java.util.Scanner;

public class FindDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its divisors: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}
