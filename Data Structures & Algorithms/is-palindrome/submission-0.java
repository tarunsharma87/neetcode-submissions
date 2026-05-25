class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char x = s.charAt(start);
            char y = s.charAt(end);

            if (!Character.isLetterOrDigit(x)) {
                start++;
            }
            else if (!Character.isLetterOrDigit(y)) {
                end--;
            }
            else if (Character.toLowerCase(x) == Character.toLowerCase(y)) {
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
