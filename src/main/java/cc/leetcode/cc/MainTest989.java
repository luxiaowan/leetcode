package cc.leetcode.cc;

import java.util.LinkedList;
import java.util.List;

/**
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 *
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * 示例 2：
 *
 * 输入：A = [2,7,4], K = 181
 * 输出：[4,5,5]
 * 解释：274 + 181 = 455
 * 示例 3：
 *
 * 输入：A = [2,1,5], K = 806
 * 输出：[1,0,2,1]
 * 解释：215 + 806 = 1021
 * 示例 4：
 *
 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * 输出：[1,0,0,0,0,0,0,0,0,0,0]
 * 解释：9999999999 + 1 = 10000000000
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * 如果 A.length > 1，那么 A[0] != 0
 *
 */
public class MainTest989 {

    public static void main(String[] args) {
        int[] A = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
        int K = 516;

        // 谁小取谁的值，迭代的时候小的计算完后，大的补上
        int len = A.length - 1;
        List<Integer> result = new LinkedList<>();
        int flag = 0;
        while (len >= 0 || K > 0) {
            // 计算和
            int t = len < 0 ? 0 : A[len];
            int r = t + K % 10 + flag;
            // 计算是否进位
            flag = r / 10;
            // 计算位上数字
            result.add(0, r % 10);

            K /= 10;
            --len;
        }
        if (flag == 1) {
            result.add(0, 1);
        }
        for (Integer item : result) {
            System.out.print(item + ",");
        }

    }

    public List<Integer> method1(int[] A, int K) {
        int flag = 0;
        List<Integer> result = new LinkedList<>();
        int r = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            // 计算和
            r = A[i] + K % 10 + flag;
            // 计算是否进位
            flag = r / 10;
            // 计算位上数字
            result.add(0, r % 10);

            K /= 10;
        }

        if (K > 0) {
            while (K > 0) {
                int ss = flag + K % 10;
                result.add(0, ss % 10);
                flag = ss / 10;
                K /= 10;
            }
        }
        if (flag == 1) {
            result.add(0, 1);
        }

        return result;
    }

}
