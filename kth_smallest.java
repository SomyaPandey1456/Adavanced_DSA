import java.util.*;

public class kth_smallest {
    // Function to find the kth smallest missing integer in the array
    public static int findKthMissing(int[] arr, int k) {
        Arrays.sort(arr);
        int prev = 0, i = 0, n = arr.length;

        while (k > 0) {
            int curr = (i < n) ? arr[i] : Integer.MAX_VALUE;
            int gap = curr - prev - 1;
            if (gap >= k) {
                return prev + k;
            }
            k -= gap;
            prev = curr;
            i++;
        }
        // If kth missing is after the last element
        return prev + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println("The " + k + "th smallest missing integer is: " + findKthMissing(arr, k));
    }
}