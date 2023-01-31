package com.coding.Java27coding;

import com.sun.tools.javac.comp.Check;
import org.omg.CORBA.DynAnyPackage.Invalid;

public class Jan27coding {

//    Find Solutions for following Questions and  ,Be ready with working of the solution you created.

//1. Remove All occurrences of given character from String?(Assume Accordingly)
//            2. How to swap 2 numbers without using 3rd variable?
//            3. How to remove whitespaces from a string?
//            4. Check if two arrays contains same elements?
//            5. Find 3rd largest element in an integer array?
//            6. How to sort HashMap by using values?
//
//    Question from JPMC.
//7.  Write a java code to check balanced parentheses in an expression using stack.
//
//    Given an expression containing characters ‘{‘,’}’,'(‘,’)’,'[‘,’]’. We have to write a code to check whether an input string has valid parentheses.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//
//            Example –
//
//    i) {[]}) – Invalid
//
//    ii) {()}[] – Valid
//
//    Note: Upload Solution to Git Hub,Update Once Done.
//    Also be ready to explain working of the code.
//
    public static void main(String[] args){
        allcode a = new allcode();
//        Write a java code to check balanced parentheses in an expression using stack
        String str = "{[]})";
        System.out.println(a.validParentheses(str));
        str = "{()}[]";
        System.out.println(a.validParentheses(str));


        //Check if two arrays contains same elements?
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 0, 0};
        int[] arr3 = {9, 9, 9, 9, 9};
        System.out.println("should be ture:" + a.containSameElements(arr1, arr2));
        System.out.println("should be false:" + a.containSameElements(arr1, arr3));

        //How to remove whitespaces from a string?
        String whitespaceStr = "s tri   ng";
        System.out.println(a.removeWhiteSpace(whitespaceStr));

    }
}
