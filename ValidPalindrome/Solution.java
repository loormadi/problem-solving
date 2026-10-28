class Solution {
    public boolean isPalindrome(String s) {
        String clean = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

        if (Character.isLetterOrDigit(c)) {
            clean += c;
        }

    }
        clean = clean.toLowerCase();


        for (int i = 0; i < clean.length() / 2; i++) {
    if (clean.charAt(i) != clean.charAt(clean.length() - 1 - i)) {
        return false;
    }
}

return true;
        
    }
}
