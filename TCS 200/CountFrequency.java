import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] != 0) {
                System.out.println(ch + " : " + freq[ch]);
                freq[ch] = 0;
            }
        }
    }
}
