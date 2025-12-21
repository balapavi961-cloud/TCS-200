import java.util.*;

public class MaximuOfSubArray {

    public static int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);

            globalMax = Math.max(globalMax, currMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;nums[i++]=sc.nextInt());
        System.out.println(maxProduct(nums));
    }
}