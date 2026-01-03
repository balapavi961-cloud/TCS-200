import java.util.*;

public class VowelsandConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') count1++;
            else count2++;
        }
        System.out.println("Vowels :" + count1);
        System.out.println("Consonents :"+ count2);
    }
}
