import java.util.Scanner;

public class EncryptString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to encrypt: ");
        String input = sc.nextLine();

        String encrypted = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                encrypted += (ch == 'z') ? 'a' : (char)(ch + 1);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                encrypted += (ch == 'Z') ? 'A' : (char)(ch + 1);
            }
            else {
                encrypted += ch;
            }
        }

        System.out.println("Encrypted string: " + encrypted);
        sc.close();
    }
}
