
import java.util.*;
public class CountFrequecy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        for(int i=0;i<n;ans[i++]=sc.nextInt());
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : ans){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
