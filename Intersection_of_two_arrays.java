class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] inter = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // check if already added
                    boolean exists = false;
                    for (int x = 0; x < k; x++) {
                        if (inter[x] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) inter[k++] = nums1[i];
                    break; // done with this number
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = inter[i];
        return result;
    }
}
