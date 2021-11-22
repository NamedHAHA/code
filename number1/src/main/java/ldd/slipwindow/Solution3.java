package main.java.ldd.slipwindow;

import java.util.Arrays;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/5 16:47
 */

/*
* 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
换句话说，s1 的排列之一是 s2 的 子串 。

示例 1：
输入：s1 = "ab" s2 = "eidbaooo"
输出：true
解释：s2 包含 s1 的排列之一 ("ba").
示例 2：
输入：s1= "ab" s2 = "eidboaoo"
输出：false
提示：
1 <= s1.length, s2.length <= 10的四次方
s1 和 s2 仅包含小写字母
滑动窗口 窗口大小固定 为s1的长度
* */
public class Solution3 {


    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        Solution3 solution3 = new Solution3();
        boolean result = solution3.checkInclusion(s1,s2);
        System.out.println(result);
    }
    public boolean checkInclusion(String s1, String s2) {

        int lengthOfS1 = s1.length();
        int lengthOfS2 = s2.length();
        if(lengthOfS1 > lengthOfS2)
            return false;

        int[] arrayOfS1 = new int[26];
        int[] arrayOfS2 = new int[26];

        for (int i = 0; i < lengthOfS1; i++) {

            ++arrayOfS1[s1.charAt(i) - 'a'];
            ++arrayOfS2[s2.charAt(i) - 'a'];
        }

        //若两个数组的长度相等，且每一个位置的元素也相等，则认为这两个数组相等
        if (Arrays.equals(arrayOfS1, arrayOfS2)) {
            return true;
        }

        for (int i = lengthOfS1; i < lengthOfS2; i++) {
            ++arrayOfS2[s2.charAt(i) - 'a'];//窗口右移一个位置
            --arrayOfS2[s2.charAt(i - lengthOfS1) - 'a'];//窗口最左边位置的元素离开 计数减一
            if (Arrays.equals(arrayOfS1, arrayOfS2))
                return true;


        }
        return false;

    }


}
