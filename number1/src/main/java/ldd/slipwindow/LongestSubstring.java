package main.java.ldd.slipwindow;

import java.util.HashMap;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/9 11:35
 */
/*
 *给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 关键字 滑动窗口
 * */
public class LongestSubstring {
    public static void main(String[] args) {
        String test1= "abcaebcbb";
        String test2= "pwwkew";
        LongestSubstring solution = new LongestSubstring();

        int result1=solution.lengthOfLongestSubstring(test1);
        //int result2 = solution.lengthOfLongestSubstring(test2);
        System.out.println(result1);
        //  System.out.println(result2);

    }

    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            System.out.println("i= "+ i + " " + s.charAt(i));
            if(map.containsKey(s.charAt(i))){  //charAt 返回第i个位置的字符
                left = Math.max(left,map.get(s.charAt(i)) + 1);
                System.out.println("left "+left);
            }
            map.put(s.charAt(i),i);
            System.out.println(map);
            //System.out.println(s.charAt(i) + " " +map.get(s.charAt(i)));
            max = Math.max(max,i-left+1);
            System.out.println("max "+max);
        }
        return max;

    }

    /* leetcode 提交版
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max =0;
        int left =0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);

        }
        return max;*/
}
