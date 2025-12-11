import java.util.*;
public class SpiralModel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int s = (int)Math.ceil(Math.sqrt(n));
        int[][] matrix = spiral(arr);
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] spiral(int[] arr){
        int n = arr.length;
        int size = (int)Math.ceil(Math.sqrt(n));

        int[][] mat = new int[size][size];

        int left = 0,right = size -1;
        int top = 0, bottom = size-1;
        int k = 0;
        while(top<= bottom && left <= right ){
            for(int i=left; i<=right && k<n;i++){
                mat[top][i] = arr[k++];
            }
            top++;
            for(int i=top;i<=bottom && k<n; i++){
                mat[i][right] = arr[k++];
            }
            right--;

            for(int i=right;i>=left && k<n;i--){
                mat[bottom][i] = arr[k++];
            }
            bottom--;

            for(int i=bottom ; i>=top && k<n;i--){
                mat[i][left] = arr[k++];
            }
            left++;
        }
        return mat;
    }

}
