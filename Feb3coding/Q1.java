package com.coding.Java27coding.Feb3coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1 {
    public static List<String> findAllSubstring(String s, int k) {

        List<String> res = new ArrayList<>();

        Map<Character, Integer> windowMap = new HashMap<>();

        int left = 0;
        int right = 0;

        while(right < s.length()) {
            char endChar = s.charAt(right);
            if((windowMap.containsKey(endChar)) && windowMap.get(endChar) > 1 ) {
                windowMap.remove(s.charAt(left));
                left ++;
                continue;
            }
            windowMap.put(endChar, windowMap.get(endChar) == null? 1: windowMap.get(endChar) + 1);

            if(right - left + 1 == k ) {
                String str = s.substring(left, right + 1);
                if(str.length() != str.chars().distinct().count()) {
                    res.add(s.substring(left, right + 1));
                }
                windowMap.remove(s.charAt(left));
                left ++;
            }
            right ++;
        }
        res.forEach(System.out::println);

        return res;
    }
}
