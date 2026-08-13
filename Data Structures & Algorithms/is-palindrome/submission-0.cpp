class Solution {
public:
    bool isPalindrome(string s) {
        int n = s.length();
        
        for(int i = 0; i <= n; i++){
            if(s[i] != s[n-i])
                return false;
        }
        return true;
    }
};
