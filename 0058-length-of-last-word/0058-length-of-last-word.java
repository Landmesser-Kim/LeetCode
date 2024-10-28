class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        int start = 0;
        for (int i = 0; i <reversed.length() ; i++) {
            if(reversed.charAt(i) != ' '){
                start = i;
                break;
            }
        }
        int end = reversed.indexOf(' ', start);
        if(end==-1){
            return reversed.substring(start).length();
        }
        
        return reversed.substring(start, end).length();
    }
}