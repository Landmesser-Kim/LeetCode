

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minlength = Integer.MAX_VALUE;

        for(String s : strs){
            if(minlength > s.length()){
                minlength = s.length();
            }
        }
        for (int i = 0; i < minlength; i++) {
            boolean allSame = true;
            for (int j = 1; j < strs.length; j++) {
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    allSame = false;
                    break;
                }
            }

            if(!allSame){
                break;
            }

            sb.append(strs[0].charAt(i));
        }

        return sb.toString();

    }
    
}