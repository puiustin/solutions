class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> aux = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(aux.contains(nums[i]))
                return true;
            aux.add(nums[i]);
        }
        return false;
    }
}