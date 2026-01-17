import java.util.*;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Stack for storing elements
        Stack<Integer> st = new Stack<>();

        System.out.println("Previous Greater Elements:");
        for (int i = 0; i < n; i++) {

            // Remove all smaller or equal elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // Print result
            if (st.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(st.peek() + " ");
            }

            // Push current element
            st.push(arr[i]);
        }

        sc.close();
    }
}
