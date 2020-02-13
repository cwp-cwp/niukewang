package com.cwp.基础部分;

import org.junit.Test;

/**
 * java.lang.StringBuffer：可变的字符序列
 * java.lang.StringBuilder:可变的字符序列，是jdk5.0新加入的，线程不安全，效率要高于StringBuffer.
 */
public class StringBuffer类常用方法 {

    /**
     * 对比String，StringBuffer,StringBuilder三者在添加上的效率：
     * 效率从高到底： StringBuilde > StringBuffer > String
     */
    @Test
    public void test2() {

    }

    /**
     * java.lang.StringBuffer和StringBuilder:代表可变的字符序列，可以对字符串内容进行增删
     * <p>
     * StringBuffer append(String s),   StringBuffer append(int n) ,
     * StringBuffer append(Object o) ,  StringBuffer append(char n),
     * StringBuffer append(long n),  StringBuffer append(boolean n),
     * StringBuffer insert(int index, String str)
     * public StringBuffer reverse() :反转此StringBuffer
     * StringBuffer delete(int startIndex, int endIndex)
     * public char charAt(int n )
     * public void setCharAt(int n ,char ch)
     * StringBuffer replace( int startIndex ,int endIndex, String str)
     * public int indexOf(String str)
     * public String substring(int start,int end)
     * public int length()
     * <p>
     * 总结：添加：append() 删除：delete(int i,int j) 修改：setCharAt(int index,char ch) 查 charAt(int n);
     * 插入：insert(int index,String str)  反转：reverse() 长度：length()
     */
    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());
        sb1.append("dfghjk").append("iuytfvb");
        System.out.println(sb1);

        sb1.insert(2, "你好");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        StringBuffer sb2 = sb1.delete(1, 5);
        System.out.println(sb2);

        sb1.setCharAt(5, 'o');
        System.out.println(sb1);

        char c = sb1.charAt(4);
        System.out.println(c);

        sb1.insert(6, 'h');
        System.out.println(sb1);
        System.out.println(sb1.length());

    }
}
