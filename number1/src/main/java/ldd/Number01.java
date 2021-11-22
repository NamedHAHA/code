package main.java.ldd;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/9/16 15:56
 */
public class Number01 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 4, 2};
        int target = 6;
        Number01 solution = new Number01();
        int[] res = solution.twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);


    }
    /*
     * ava HashMap containsKey() 方法
     * containsKey() 方法检查 hashMap 中是否存在指定的 key 对应的映射关系
     * 如果 hashMap 中是否存在指定的 key 对应的映射关系返回 true，否则返回 false
     * */


    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                res[0] = i;
                res[1] = map.get(sub);
            }
            //map.put(nums[i], i);
        }
        return res;

    }


    /*
    * 两层for循环 暴力求解
    *
    * public int[] twoSum(int[] nums, int target) {
    int []ans=new int[2];
    for(int i=0;i<nums.length;i++){
        for(int j=(i+1);j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
        }
    }
    return ans;
}
    * */


    /*
    * 空间换时间 时间复杂度变为O(n)
    * public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
    }
    for(int i=0;i<nums.length;i++){
        int sub=target-nums[i];
        if(map.containsKey(sub)&&map.get(sub)!=i){
            return new int[]{i,map.get(sub)};
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
    *
    * */





}
