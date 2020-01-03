package cc.leetcode.cc;

import java.util.HashMap;
import java.util.Map;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 *
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *  
 *
 * 提示：
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array
 */
public class MainTest961 {

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 3 };
        System.out.println(repeatedNTimes(A));
    }

    public static int repeatedNTimes(int[] A) {
        int n = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i)) {
                return i;
            }
            map.put(i, i);
        }
        return 0;
    }

}
