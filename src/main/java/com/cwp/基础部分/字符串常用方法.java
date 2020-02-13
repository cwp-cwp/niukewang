package com.cwp.基础部分;

import org.junit.Test;

public class 字符串常用方法 {
    /**
     * 1.字符串 与基本数据类型、包装类之间转换
     * ①字符串 --->基本数据类型、包装类:调用相应的包装类的parseXxx(String str);
     * ①基本数据类型、包装类--->字符串:调用字符串的重载的valueOf()方法
     * <p>
     * 2.字符串与字节数组间的转换
     * ①字符串---->字节数组:调用字符串的getBytes()
     * ②字节数组---->字符串：调用字符串的构造器
     * <p>
     * 3.字符串与字符数组间的转换
     * ①字符串---->字符数组：调用字符串的toCharArray();
     * ②字符数组---->字符串:调用字符串的构造器
     */

    /**
     * 字符串与字符数组间的转换
     */
    @Test
    public void test5() {
        String str1 = "xcv45478中國人";
        char c[] = str1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(new String(c));

    }

    /**
     * 字符串与字节数组间的转换
     */
    @Test
    public void test4() {
        String str = "sdfgh852749";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println((char) b[i]);
        }
        String str1 = new String(b);
        System.out.println(str1);
    }

    /**
     * 字符串 与基本数据类型、包装类之间转换
     */
    @Test
    public void test3() {
        String str1 = "123";
        int i = Integer.parseInt(str1);
        System.out.println(i);

        int j = 12345;
        String str2 = String.valueOf(j);
        System.out.println(str2);
    }

    /**
     * public String substring(int startpoint)
     * public String substring(int start,int end):返回从start开始到end结束的一个左闭右开的子串。start可以从0开始的。
     * pubic String replace(char oldChar,char newChar)
     * public String replaceAll(String old,String new)
     * public String trim()：去除当前字符串中首尾出现的空格，若有多个，就去除多个。
     * public String concat(String str):连接当前字符串与str
     * public String[] split(String regex)：按照regex将当前字符串拆分，拆分为多个字符串，整体返回值为String[]
     */
    @Test
    public void test2() {
        String str1 = "自强不息，獨樹一幟";
        String str2 = "中國共產黨萬歲";
        String s = str1.substring(5, 9);
        System.out.println(s);
        System.out.println(str1.replace("自", "己"));
        System.out.println(str1.replaceAll("自强", "你"));

        String str3 = "   dfg   vbn  ";
        String s1 = str3.trim();
        System.out.println("--" + s1 + "--");
        System.out.println("--" + str3 + "--");
        String s2 = str1.concat(str2);
        System.out.println(s2);
        System.out.println();

        String str4 = "assd-jnbfh-wddnjx*bn-uwef";
        String[] s4 = str4.split("-");
        for (int i = 0; i < s4.length; i++) {

            System.out.println(s4[i]);
        }

    }

    /**
     * public int length()
     * public char charAt(int index):返回在指定index位置的字符。index从0开始
     * public boolean equals(Object anObject)：比较两个字符串是否相等。相等返回true。否则返回false
     * public int compareTo(String  anotherString)
     * public int indexOf(String s)：返回s字符串在当前字符串中首次出现的位置。若没有，返回-1
     * public int indexOf(String s ,int startpoint)：返回s字符串从当前字符串startpoint位置开始的，首次出现的位置。
     * public int lastIndexOf(String s):返回s字符串最后一次在当前字符串中出现的位置。若无，返回-1
     * public int lastIndexOf(String s ,int startpoint)
     * public boolean startsWith(String  prefix):判断当前字符串是否以prefix开始。
     * public boolean endsWith(String suffix)：判断当前字符串是否以suffix结束
     * public boolean regionMatches(int firstStart,String other,int otherStart ,int length):
     * 判断当前字符串从firstStart开始的子串与另一个字符串other从otherStart开始，length长度的字串是否equals
     */
    @Test
    public void test1() {
        String str1 = "javase";
        String str2 = "javase";
        String str4 = "dfgh";
        String str5 = "acdfghsdfghj";

        System.out.println(str5.indexOf(str4, 3));
        System.out.println(str5.lastIndexOf(str4, 7));

        System.out.println(str1 == str2);

        String str3 = new String("javase");
        System.out.println(str1 == str3);

        boolean b = str1.equals(str2);
        System.out.println(b);

        int i = str1.compareTo(str4);
        System.out.println(i);

        System.out.println(str5.indexOf(str4));
        System.out.println(str5.startsWith("a"));

    }

}
