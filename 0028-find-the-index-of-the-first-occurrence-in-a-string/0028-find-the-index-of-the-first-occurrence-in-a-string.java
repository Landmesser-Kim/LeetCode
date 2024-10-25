class Solution {
    public int strStr(String haystack, String needle) {
        char[] charArray = needle.toCharArray();

        int size = needle.length();

        for (int lt = 0; lt <= haystack.length()-size; lt++) {
            if(haystack.substring(lt, lt+size).equals(needle)){
                return lt;
            }
        }

        return -1;
    }
    
}