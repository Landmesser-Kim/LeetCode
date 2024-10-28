class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = 1; i <= digits.length; i++) {
            if(digits[digits.length-i] != 9){
                digits[digits.length-i] +=1;
                return digits;
            }
            digits[digits.length-i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
        
    }

}