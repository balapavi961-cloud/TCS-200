import java.util.Scanner;

public class RotateString {

    public static String rotateString(String str, int k) {
        if (str == null || str.length() == 0) {
            return str;
        }

        int n = str.length();
        k = k % n;

        return str.substring(k) + str.substring(0, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        String result = rotateString(str, k);
        System.out.println("Rotated String: " + result);

        sc.close();
    }
}
