package com.codepower.easy.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Justin Mathew @dev_io
 * Explanation : Given two strings ransomNote and magazine, return true if
 * ransomNote can be constructed from magazine and false otherwise.
 *
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 *
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 *
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    private static boolean canConstruct(String magazine, String ransomNote) {

        Map<Character,Integer> magazineCountMap=makeCountMap(magazine);

        for(char c:ransomNote.toCharArray())
        {
            if(magazineCountMap.containsKey(c))
            {
                int count=magazineCountMap.get(c);
                if(count==1)
                {
                    magazineCountMap.remove(c);
                }
                else
                {
                    magazineCountMap.put(c,count-1);
                }
            }
            else
            {
                return false;
            }
        }
return true;
    }

    private static Map<Character, Integer> makeCountMap(String magazine) {
        Map<Character,Integer>counts= new HashMap<>();
        for(char c:magazine.toCharArray())
        {
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        return counts;
    }

}
