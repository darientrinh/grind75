class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowerS = newS.toLowerCase();

        char[] forward = lowerS.toCharArray();
        int j = 0;

        for (int i = forward.length - 1; i >= 0; i--) {
            if (!(forward[j] == forward[i])) {
                return false;
            }
            j++;
        }

        return true;
    }
}