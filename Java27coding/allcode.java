package com.coding.Java27coding;

import java.util.*;

public class allcode {

    public boolean validParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(!stack.empty() && stack.peek() == '{' && s.charAt(i) == '}') stack.pop();
            else if(!stack.empty() && stack.peek() == '[' && s.charAt(i) == ']') stack.pop();
            else if(!stack.empty() && stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public boolean containSameElements(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            if(!set.contains(arr1[i])) set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])) return true;
        }
        return false;
    }

    public String removeWhiteSpace(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public HashMap sortHashmapByValue(Map map){

    }
}
