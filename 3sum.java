class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> out= new HashSet<>(); 
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if ( i!=j && j!=k && i!=k && nums[i]+nums[j]+nums[k]==0 ){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        out.add(inner);
                    }
                }
            }
        }
        return out ;
    }
}