class Solution {
    public boolean isPalindrome(String s) {
        String formatted = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                formatted += Character.toLowerCase(s.charAt(i));
            }
        }

        if (formatted.length() == 1)
            return true;

            int[] fr = new int[250];
        for (int i = 0; i < formatted.length() / 2; i++) {
            fr[formatted.charAt(i)]++;
            fr[formatted.charAt(formatted.length() - i - 1)]--;
        }

        for (int freq : fr) {
            if (freq != 0)
                return false;
        }

        return true;
    }
}
