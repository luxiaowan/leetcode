package cc.kevinlu.leetcode.cc;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 *
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-strings
 */
public class MainTest415 {

    public static void main(String[] args) {
        String num1 = "11577363127709111111115773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709";
        String num2 = "915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709157736312770915773631277091577363127709";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        if ((num1 == null && num2 == null) || (num1.length() == 0 && num2.length() == 0)) {
            return "0";
        }
        if (num1.length() == 0) {
            return num2;
        }
        if (num2.length() == 0) {
            return num1;
        }
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int flag = 0;
        int cIndex1 = c1.length - 1;
        int cIndex2 = c2.length - 1;
        StringBuffer sb = new StringBuffer();
        int n1, n2, sum;
        while (cIndex1 >= 0 || cIndex2 >= 0) {
            // 若下标小于0，则用0参与计算，否则用数组中的数字进行计算
            n1 = cIndex1 < 0 ? 0 : (int) c1[cIndex1] - 48;
            n2 = cIndex2 < 0 ? 0 : (int) c2[cIndex2] - 48;
            // 计算和
            sum = n1 + n2 + flag;
            // 计算flag
            flag = sum / 10;
            sb.append(sum % 10);
            cIndex1--;
            cIndex2--;
        }
        if (flag == 1) {
            sb.append(flag);
        }
        String str = sb.reverse().toString();

        return str;
    }

}
