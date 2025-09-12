public class MaxSubarray {
/*    public static int maxSub(int[]nums,int k){
        if(nums==null||nums.length<k||k<=0){
            return 0;
        }
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length-k+1; i++) {
            for (int j = i; j < i+k; j++) {
                current+=nums[j];
            }
            max = Math.max(max,current);
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(maxSub(arr,k));
    }
}*/

    // Returns an array of sums of all subarrays of size k
    public static int[] subarraySums(int[] arr, int k) {
        if (arr == null || arr.length < k || k <= 0) {
            return new int[0];
        }
        int max =0;
        int current=0;
        for (int i=0;i<k;i++){
            cuurent+=arr[i];
        }
        for (int j = 1; j < arr.length-k; j++) {
            int new_element=arr[j+k-1];
            int old_element=arr[j-1];
            current+=new_element-old_element;
            if (current>max){
                max=current;
            }
        }
        return max;
    }