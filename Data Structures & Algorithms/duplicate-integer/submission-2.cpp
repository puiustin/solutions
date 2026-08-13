class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> check;
        for(int num : nums){
            if(check.contains(num))
                return 1;
            else check.insert(num);
        }
        return 0;
    }
};