package cc.leetcode.cc;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 */
public class MainTest167 {

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 13;
        int[] r = twoSum(numbers, target);
        System.out.println(r[0] + ", " + r[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if ((numbers[left] + numbers[right]) > target) {
                right--;
            } else if ((numbers[left] + numbers[right]) < target) {
                left++;
            } else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int len = numbers.length, lastLen = len - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (i < lastLen && (numbers[i] + numbers[i + 1] == target)) {
                return new int[] { i + 1, i + 2 };
            }
            map.put(numbers[i], i + 1);
        }
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - numbers[i]) && map.get(target - numbers[i]) > i + 1) {
                return new int[] { i + 1, map.get(target - numbers[i]) };
            }
        }

        return null;
    }

    public static int[] twoSum1(int[] numbers, int target) {
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            if (numbers[i] > target) {
                return null;
            }
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i + 1, j + 1 };
                }
                if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
        }
        return null;
    }

}
