class Solution {
    public boolean isPalindrome(String s) {
        String formatted = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                formatted += Character.toLowerCase(s.charAt(i));
            }
        }

        // if (formatted.length() == 1)
        //     return true;

        int[] frequency = new int[250];
        for (int i = 0; i < formatted.length() / 2; i++) {
            frequency[formatted.charAt(i)]++;
            frequency[formatted.charAt(formatted.length() - i - 1)]--;
        }

        for (int freq : frequency) {
            if (freq != 0)
                return false;
        }

        return true;
    }
}
