import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for prime factorization: ");
        int n = sc.nextInt();
        int original = n;

        System.out.print("Prime factorization of " + original + " is: ");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        System.out.println();
        sc.close();
    }
}
