import java.util.Scanner;

public class RomanToInteger {

    static int value(char r) {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String s = sc.next().toUpperCase();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));

            if (i + 1 < s.length() && current < value(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        System.out.println("Integer value: " + result);
        sc.close();
    }
}
