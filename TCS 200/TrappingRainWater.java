import java.util.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        // Input heights
        System.out.println("Enter heights of bars:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int bottom = st.pop();

                if (st.isEmpty())
                    break;

                int left = st.peek();
                int distance = i - left - 1;
                int boundedHeight = Math.min(height[i], height[left]) - height[bottom];

                water += distance * boundedHeight;
            }
            st.push(i);
        }

        // Output
        System.out.println("Total trapped rain water: " + water);

        sc.close();
    }
}
