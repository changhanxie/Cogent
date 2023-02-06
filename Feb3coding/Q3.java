package com.coding.Java27coding.Feb3coding;

public class Q3 {
    public boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            char leftChar = s.charAt(left);
            if(Character.isDigit(leftChar) || Character.isLetter(leftChar)){
            }
            else{
                left++;
                continue;
            }

            char rightChar = s.charAt(right);
            if(Character.isDigit(rightChar) || Character.isLetter(rightChar)){
            }
            else{
                right--;
                continue;
            }
            if (leftChar != rightChar) return false;
            left++; right--;
        }
        return true;
    }
}
