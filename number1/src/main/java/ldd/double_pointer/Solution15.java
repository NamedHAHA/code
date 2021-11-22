package main.java.ldd.double_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/12 17:14
 */
/*
* 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。

注意：答案中不可以包含重复的三元组。
输入：nums = [-1,0,1,2,-1,-4]
输出：[[-1,-1,2],[-1,0,1]]
*
* */
public class Solution15 {

    public static void main(String[] args) {

        int[] test = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = new ArrayList<>();
        Solution15 solution15 = new Solution15();
        result = solution15.threeSum(test);
        for(int i = 0;i<result.size();i++) {
            System.out.println(result.get(i));

        }


    }
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length < 3) {
            return result;
        }
        Arrays.sort(nums);//升序
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i的值"+i);
            if (nums[i] > 0)
                return result;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int curr = nums[i];
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int temp = curr + nums[left] + nums[right];
                if (temp == 0) {
                    System.out.println("和为零");

                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;


                } else if (temp < 0) {
                    System.out.println("和小于零");
                    left++;
                }
                else{
                    System.out.println("和大于零");
                    right--;
                }

            }

        }
        return result;
    }

}
