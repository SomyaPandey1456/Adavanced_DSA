class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;

        Set<Character> set = new HashSet<>(); 
        int i = 0, j = 0;

        while (j < n) {
            // If char not in set, expand the window
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                res = Math.max(res, j - i + 1);
                j++;
            } 
            // If char already in set, shrink from left
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}
