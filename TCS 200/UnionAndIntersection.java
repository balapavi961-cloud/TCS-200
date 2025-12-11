
import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;arr1[i++]=sc.nextInt());
        for(int i=0;i<m;arr2[i++]=sc.nextInt());
        union(arr1,arr2);
        System.out.println();
        intersection(arr1,arr2);
    }
    public static void union(int[] num1,int[] num2){
        int n = num1.length;
        int m = num2.length;
        int[] arr = new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=num1[i];
        }
        for(int i=0;i<m;i++){
            arr[i+n]= num2[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static  void intersection(int[] num1,int[] num2){
        int n = num1.length;
        int m = num2.length;
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<n){
            int j = 0;
            while(j<m){
                if(num1[i]==num2[j]){
                    list.add(num1[i]);
                }
                j++;
            }
            i++;
        }
        System.out.println(list);
    }

}
