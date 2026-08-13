class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] fr = new int[100];
        for(int i = 0; i < nums.length; i++){
            fr[nums[i]] = fr[nums[i]] + 1;
            if(fr[nums[i]] > 1)
                return true;
        }
        return false;
    }
}