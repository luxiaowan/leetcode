package cc.leetcode.cc;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 */
public class MainTest709 {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String str) {
        char[] chs = str.toCharArray();
        for (int i = 0, size = chs.length; i < size; i++) {
            if (chs[i] >= 65 && chs[i] <= 90) {
                chs[i] = (char) (chs[i] + 32);
            }
        }
        return new String(chs);
    }

}
