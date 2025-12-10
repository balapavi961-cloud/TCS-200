import java.util.*;

public class FindElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int large = largest(arr);
        int small = smallest(arr);
        secondsmallest(arr,small);
        secondlargest(arr,large);

    }
    public static int largest(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void secondlargest(int[] arr,int max){
        int smax = 0;
        for(int i=0;i<arr.length;i++){
            if(smax < arr[i] && smax != max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
    public static void secondsmallest(int[] arr,int min){
        int smin = arr[0];
        for(int i=0;i<arr.length;i++){
            if(smin > arr[i] && smin != min){
                smin = arr[i];
            }
        }
        System.out.println(smin);
    }
}
