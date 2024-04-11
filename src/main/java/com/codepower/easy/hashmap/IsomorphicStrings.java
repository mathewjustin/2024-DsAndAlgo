package com.codepower.easy.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Justin Mathew @dev_io
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class IsomorphicStrings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] dict1 = new int[256];
        int[] dict2 = new int[256];

        Arrays.fill(dict1, -1);
        Arrays.fill(dict2, -1);

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (dict1[c1] == -1 && dict2[c2] == -1) {
                dict1[c1] = c2;
                dict2[c2] = c1;
            } else if (!(dict1[c1] == c2 && dict2[c2] == c1)) {
                return false;
            }

        }
        return true;

    }



}
