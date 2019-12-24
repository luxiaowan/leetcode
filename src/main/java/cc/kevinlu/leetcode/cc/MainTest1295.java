package cc.kevinlu.leetcode.cc;

/**
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数） 
 * 345 是 3 位数字（位数为奇数）  
 * 2 是 1 位数字（位数为奇数） 
 * 6 是 1 位数字 位数为奇数） 
 * 7896 是 4 位数字（位数为偶数）  
 * 因此只有 12 和 7896 是位数为偶数的数字
 * 示例 2：
 *
 * 输入：nums = [555,901,482,1771]
 * 输出：1 
 * 解释： 
 * 只有 1771 是位数为偶数的数字。
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 *
 */
public class MainTest1295 {

    public static void main(String[] args) {
        int[] nums = { 55, 90, 482, 1771 };

        System.out.println(findNumbers2(nums));
    }

    public static int findNumbers2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 10 > 0 && nums[i] / 100 == 0) {
                count++;
            } else if (nums[i] / 1000 > 0 && nums[i] / 10000 == 0) {
                count++;
            } else if (nums[i] == 100000) {
                count++;
            }
        }
        return count;
    }

    public static int findNumbers1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999) || nums[i] == 100000) {
                count++;
            }
        }
        return count;
    }

}
