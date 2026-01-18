import java.util.Scanner;

public class AutomorphicNumber {

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int digits = countDigits(n);

        int lastPart = square % (int) Math.pow(10, digits);

        if (lastPart == n) {
            System.out.println(n + " is an Automorphic Number");
        } else {
            System.out.println(n + " is NOT an Automorphic Number");
        }

        sc.close();
    }
}
