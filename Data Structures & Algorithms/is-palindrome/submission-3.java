class Solution {
    public boolean isPalindrome(String s) {
        String formatted = "";
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                formatted += c;
            }
        }

        formatted = formatted.toLowerCase();
        int start = 0;
        int end = formatted.length() - 1;

        while (start < end) {
            if (formatted.charAt(start) != formatted.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
