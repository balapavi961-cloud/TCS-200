import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
