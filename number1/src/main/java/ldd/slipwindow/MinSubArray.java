package main.java.ldd.slipwindow;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/4 17:50
 */
/*
* 209. 长度最小的子数组
*
* 给定一个含有 n 个正整数的数组和一个正整数 target 。
找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
如果不存在符合条件的子数组，返回 0 。
示例 1：
输入：target = 7, nums = [2,3,1,2,4,3]
输出：2
解释：子数组 [4,3] 是该条件下的长度最小的子数组。
示例 2：
输入：target = 4, nums = [1,4,4]
输出：1
示例 3：
输入：target = 11, nums = [1,1,1,1,1,1,1,1]
输出：0
* */
public class MinSubArray {


    public static void main(String[] args) {
        int[] test = {2,3,1,2,4,3};

        MinSubArray minSubArray = new MinSubArray();
        int result = minSubArray.minSubArrayLen(7,test);
        System.out.println(result);

    }

    public int minSubArrayLen(int target, int[] nums) {

        int left =0;
        int sum =0;
        int result = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];
            //System.out.println(sum);
            while (sum >= target) {
                result = Math.min(result,right-left+1);
                //System.out.println(result);
                sum  = sum - nums[left];
                left = left +1;
            }

        }
        return result == Integer.MAX_VALUE ? 0 : result;

    }
}

/*
* 滑动窗口法
* 1、左窗口不变 更新右窗口边界值 若窗口内元素相加大于等于目标值
* 2、执行循环 求此时窗口内包含的元素个数 更新元素和（减去左窗口边界的元素值）  左窗口边界值+1 即窗口的左边界右移
* 3、继续判断更新后的元素和是否大于目标值 若是求取此时窗口内的元素个数并与之前的元素个数做比较 取最小值  继续更新元素和和窗口左边界值 重复步骤2
*
* */
