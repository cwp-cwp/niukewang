package com.cwp.基础部分;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.模拟一个trim方法，去除字符串两端的空格。
 * <p>
 * 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
 * <p>
 * 3.获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ab”在 “abkkcadkabkebfkabkskab”
 * 中出现的次数
 * <p>
 * 4.获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
 * <p>
 * 5.对字符串中字符进行自然顺序排序。
 * <p>
 * 练习：I am a student!   写一个方法：实现输出 !student a am I
 */
public class 字符串排序等等 {

    public static void main(String[] args) {
        String str = "   sdf g  fg   ";
        String str1 = myTrim(str);
        System.out.println(str1);
        System.out.println();

        String str2 = "asdfgh";
        String str3 = reverseString(str2, 2, 5);
        System.out.println(str3);
        System.out.println();

        String str5 = "abkkcadkabkebfkabkskab";
        String str4 = "abk";
        int i = getTime(str5, str4);
        System.out.println("子字符串在母字符串中出現的次數為:" + i + " 次！");

        System.out.println();

        List<String> strs5 = getMaxSubString("abcwerthelloyuiodef", "abcwecvhellobnm");
        System.out.println(strs5);

        System.out.println();

        String str6 = "sdfghjwddoiuytrwergjkwdvdb";
        String str7 = mySort(str6);
        System.out.println(str7);
    }

    /**
     * 5.对字符串中字符进行自然顺序排序。
     */
    public static String mySort(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        String str1 = new String(c);
        return str1;

    }

    /**
     * 4.获取两个字符串中最大相同子串。比如：
     * str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
     */
    public static List<String> getMaxSubString(String str1, String str2) {
        String maxStr = (str1.length() > str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int len = minStr.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int x = 0, y = len - i; y <= len; x++, y++) {
                String str = minStr.substring(x, y);
                if (maxStr.contains(str)) {
                    list.add(str);
                }
            }
            if (list.size() != 0) {
                return list;
            }
        }
        return null;
    }

    /**
     * 3.获取一个字符串在另一个字符串中出现的次数。
     * 比如：获取“ab”在 “abkkcadkabkebfkabkskab”
     * 中出现的次数
     */
    public static int getTime(String str1, String str2) {
        int count = 0;
        int len;
        while ((len = str1.indexOf(str2)) != -1) {
            str1 = str1.substring(len + str2.length(), str1.length());
            count++;
        }

        return count;

    }

    /**
     * 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
     */
    public static String reverseString(String str, int start, int end) {
        char c[] = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        String str1 = new String(c);

        return str1;

    }

    /**
     * 1.模拟一个trim方法，去除字符串两端的空格。
     */
    public static String myTrim(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        while (start < str.length() && str.charAt(end) == ' ') {
            end--;
        }
        return str.substring(start, end + 1);

    }

}
