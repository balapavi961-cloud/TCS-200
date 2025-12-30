import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NO");
        }
    }
}
