class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);

        StringBuilder sb = new StringBuilder(number);
        String reversedNumber = sb.reverse().toString();

        if(number.equals(reversedNumber)){
            return true;
        }else{
            return false;
        }
    }
    
}