package com.cwp.java;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class Main {


    /**
     * 题目描述
     * 计算字符串最后一个单词的长度，单词以空格隔开。
     * 输入描述:
     * 一行字符串，非空，长度小于5000。
     * <p>
     * 输出描述:
     * 整数N，最后一个单词的长度。
     * <p>
     * 示例1
     * 输入
     * hello world
     * 输出
     * 5
     *
     * @param args
     */
//    public static void main(String[] args) {
//
//        String str;
////        System.out.println("请输入长度小于 5000 的字符串");
//        Scanner scanner = new Scanner(System.in);
//        str = scanner.nextLine();
//        while (true) {
//            if (str.trim().equals("") || str.length() > 5000) {
////                System.out.println("字符串不规范,请重新输入...");
//                str = scanner.next();
//            } else {
//                break;
//            }
//        }
//        String[] split = str.split(" ");
//        for (int i = 0; i < split.length; i++) {
//            if (i == split.length - 1) {
//                System.out.println(split[i].length());
//            }
//        }
//
//    }


    /**
     * 题目描述
     * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
     * <p>
     * 输入描述:
     * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
     * <p>
     * 输出描述:
     * 输出输入字符串中含有该字符的个数。
     * <p>
     * 示例1
     * 输入
     * ABCDEF
     * A
     * 输出
     * 1
     */
//    public static void main(String[] args) {
//
//        String str = "";
//        String myChar = "";
//        Scanner scanner = new Scanner(System.in);
//        str = scanner.nextLine().toUpperCase();
//        myChar = scanner.nextLine().toUpperCase();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (String.valueOf(str.charAt(i)).equals(myChar)) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }

    /**
     * 题目描述
     * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作
     * (同一个测试用例里可能会有多组数据，希望大家能正确处理)。
     * <p>
     * Input Param
     * <p>
     * n               输入随机数的个数
     * <p>
     * inputArray      n个随机整数组成的数组
     * <p>
     * Return Value
     * <p>
     * OutputArray    输出处理后的随机整数
     * <p>
     * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
     * <p>
     * 输入描述:
     * 输入多行，先输入随机整数的个数，再输入相应个数的整数
     * <p>
     * 输出描述:
     * 返回多行，处理后的结果
     * <p>
     * 示例1
     * 输入
     * 3
     * 1
     * 3
     * 2
     * 输出
     * 1
     * 2
     * 3
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            Set<Integer> set = new TreeSet<>();
//            int count = scanner.nextInt();
//            for (int i = 0; i < count; i++) {
//                int x = scanner.nextInt();
//                set.add(x);
//            }
//            for (int s : set) {
//                System.out.println(s);
//            }
//        }
//    }

    /**
     * 题目描述
     * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
     * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * 输入描述:
     * 连续输入字符串(输入2次,每个字符串长度小于100)
     * <p>
     * 输出描述:
     * 输出到长度为8的新字符串数组
     * <p>
     * 示例1
     * 输入
     * abc
     * 123456789
     * 输出
     * abc00000
     * 12345678
     * 90000000
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        sub(str1);
//        sub(str2);
//    }
//
//    private static void sub(String str) {
//        List<String> list = new ArrayList<>();
//        while (str.length() >= 8) {
//            list.add(str.substring(0, 8));
//            str = str.substring(8);
//        }
//        if (str.length() < 8 && str.length() > 0) {
//            str += "00000000";
//            list.add(str.substring(0, 8));
//        }
//        for (String s : list) {
//            System.out.println(s);
//        }
//    }

    /**
     * 题目描述
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
     * <p>
     * 输入描述:
     * 输入一个十六进制的数值字符串。
     * <p>
     * 输出描述:
     * 输出该数值的十进制字符串。
     * <p>
     * 示例1
     * 输入
     * 0xA
     * 输出
     * 10
     */
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//            System.out.println(Integer.parseInt(str.substring(2), 16));
//        }
//
//    }

    /**
     * 题目描述
     * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
     * <p>
     * 输入描述:
     * 输入一个正浮点数值
     * <p>
     * 输出描述:
     * 输出该数值的近似整数值
     * <p>
     * 示例1
     * 输入
     * 5.5
     * 输出
     * 6
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        float f = scanner.nextFloat();
//        String ff = String.valueOf(f);
//        String[] splits = ff.split("\\.");
//        int result = 0;
//        if (splits.length >= 2) {
//            if (Integer.parseInt(splits[1].substring(0, 1)) >= 5) {
//                result = Integer.parseInt(splits[0]) + 1;
//            } else {
//                result = Integer.parseInt(splits[0]);
//            }
//        }
//        System.out.println(result);
//
//    }

    /**
     * 题目描述
     * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
     * <p>
     * 输入描述:
     * 先输入键值对的个数
     * 然后输入成对的index和value值，以空格隔开
     * <p>
     * 输出描述:
     * 输出合并后的键值对（多行）
     * <p>
     * 示例1
     * 输入
     * 4
     * 0 1
     * 0 2
     * 1 2
     * 3 4
     * 输出
     * 0 3
     * 1 2
     * 3 4
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Map<Integer, Integer> map = new HashMap<>();
//        int count = scanner.nextInt();
//        for (int i = 0; i <= count; i++) {
////            System.out.println("第" + i + "次");
//            String str = scanner.nextLine();
////            System.out.println(str);
//            if (str.trim().equals("")) {
//                continue;
//            }
//            int key = Integer.parseInt(str.substring(0, str.lastIndexOf(" ")));
//            int value = Integer.parseInt(str.substring(str.lastIndexOf(" ") + 1));
//            if (map.containsKey(key)) {
//                value += map.get(key);
//            }
//            map.put(key, value);
//        }
//        List<Integer> list = new ArrayList<>();
//        for (Integer key : map.keySet()) {
//            list.add(key);
//        }
//        Collections.排序算法(list);
//        for (Integer i : list) {
//            System.out.println(i + " " + map.get(i));
//        }
//    }

    /**
     * 题目描述
     * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
     * <p>
     * 输入描述:
     * 输入一个int型整数
     * <p>
     * 输出描述:
     * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
     * <p>
     * 示例1
     * 输入
     * 9876673
     * 输出
     * 37689
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        List<Integer> list = new ArrayList<>();
//        String s = String.valueOf(n);
//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder = stringBuilder.reverse();
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            int ii = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
//            if (list.contains(ii)) {
//                continue;
//            }
//            list.add(ii);
//        }
//        StringBuilder str1 = new StringBuilder();
//        for (Integer i : list) {
//            str1.append(i);
//        }
//        System.out.println(str1);
//    }

    /**
     * 题目描述
     * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
     * <p>
     * 输入描述:
     * 输入N个字符，字符在ACSII码范围内。
     * <p>
     * 输出描述:
     * 输出范围在(0~127)字符的个数。
     * <p>
     * 示例1
     * 输入
     * abc
     * 输出
     * 3
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        Set<Object> set = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//        System.out.println(set.size());
//    }

    /**
     * 题目描述
     * 描述：
     * <p>
     * 输入一个整数，将这个整数以字符串的形式逆序输出
     * <p>
     * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
     * <p>
     * 输入描述:
     * 输入一个int整数
     * <p>
     * 输出描述:
     * 将这个整数以字符串的形式逆序输出
     * <p>
     * 示例1
     * 输入
     * 1516000
     * 输出
     * 0006151
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String str = String.valueOf(n);
//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder = stringBuilder.reverse();
//        System.out.println(stringBuilder);
//    }

    /**
     * 题目描述
     * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
     * 输入描述:
     * 输入N个字符
     * <p>
     * 输出描述:
     * 输出该字符串反转后的字符串
     * <p>
     * 示例1
     * 输入
     * abcd
     * 输出
     * dcba
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder = stringBuilder.reverse();
//        System.out.println(stringBuilder);
//    }

    /**
     * 题目描述
     * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
     * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
     * 输入描述:
     * 将一个英文语句以单词为单位逆序排放。
     * <p>
     * 输出描述:
     * 得到逆序的句子
     * <p>
     * 示例1
     * 输入
     * I am a boy
     * 输出
     * boy a am I
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] splits = str.split(" ");
//        for (int i = splits.length - 1; i >= 0; i--) {
//            System.out.print(splits[i] + " ");
//        }
//    }

    /**
     * 骰子有6个面，现在用1，2，3，4，5，6分别代表一个骰子的左，右，前，后，上，下的初始位置，
     * 用R代表向右滚动一次，用L代表向左滚动一次，
     * 可以向前翻转（用F表示向前翻转1次），可以向后翻转（用B表示向右翻转1次），
     * 可以逆时针旋转（用A表示逆时针旋转90度），可以顺时针旋转（用C表示逆时针旋转90度），
     * 现从初始状态开始，根据输入的动作序列，计算得到最终的状态。
     * <p>
     * 输入描述：
     * <p>
     * 初始状态为：123456
     * <p>
     * 输入只包含LRFBAC的字母序列，最大长度为50，可重复
     * <p>
     * 输出描述：输出最终状态
     * <p>
     * 输入例子:RA
     * <p>
     * 输出例子：436512
     */
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String action = scanner.nextLine();
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < action.length(); i++) {
//            arr = handle(action.charAt(i), arr);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//
//    }
//
//    /**
//     * @param action 动作
//     * @param arr    原数组
//     * @return 动作变换后的新数组
//     */
//    private static int[] handle(char action, int[] arr) {
//        int temp[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        switch (action) {
//            case 'L':
//                arr[0] = temp[4];
//                arr[1] = temp[5];
//                arr[4] = temp[1];
//                arr[5] = temp[0];
//                break;
//            case 'R':
//                arr[0] = temp[5];
//                arr[1] = temp[4];
//                arr[4] = temp[0];
//                arr[5] = temp[1];
//                break;
//            case 'B':
//                arr[2] = temp[4];
//                arr[3] = temp[5];
//                arr[4] = temp[3];
//                arr[5] = temp[2];
//                break;
//            case 'F':
//                arr[2] = temp[5];
//                arr[3] = temp[4];
//                arr[4] = temp[2];
//                arr[5] = temp[3];
//                break;
//            case 'C':
//                arr[0] = temp[2];
//                arr[1] = temp[3];
//                arr[2] = temp[1];
//                arr[3] = temp[0];
//                break;
//            case 'A':
//                arr[0] = temp[3];
//                arr[1] = temp[2];
//                arr[2] = temp[0];
//                arr[3] = temp[1];
//                break;
//            default:
//                break;
//        }
//        return arr;
//    }


    /**
     * 五张牌，每张牌由牌大小和花色组成，牌大小2~10、J、Q、K、A，牌花色为红桃、黑桃、梅花、方块四种花色之一。
     * 判断牌型:
     * 牌型1，同花顺：同一花色的顺子，如红桃2红桃3红桃4红桃5红桃6。
     * 牌型2，四条：四张相同数字 + 单张，如红桃A黑桃A梅花A方块A + 黑桃K。
     * 牌型3，葫芦：三张相同数字 + 一对，如红桃5黑桃5梅花5 + 方块9梅花9。
     * 牌型4，同花：同一花色，如方块3方块7方块10方块J方块Q。
     * 牌型5，顺子：花色不一样的顺子，如红桃2黑桃3红桃4红桃5方块6。
     * 牌型6，三条：三张相同 + 两张单。
     * 牌型7，其他。
     * 说明：
     * 1）五张牌里不会出现牌大小和花色完全相同的牌。
     * 2）前面的牌型比后面的牌型大，如同花顺比四条大，依次类推。
     * <p>
     * 输入描述:
     * 输入由5行组成
     * 每行为一张牌大小和花色，牌大小为2~10、J、Q、K、A，花色分别用字符H、S、C、D表示红桃、黑桃、梅花、方块。
     * 输出描述:
     * 输出牌型序号，5张牌符合多种牌型时，取最大的牌型序号输出
     * 示例1
     * 输入：
     * 2 H
     * 3 C
     * 6 S
     * 5 S
     * 4 S
     * 输出：
     * 5
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            String str = scanner.nextLine();
//            String[] split = str.split(" ");
//            list.add(split[0] + "-" + split[1]);
//        }
//
//        List<String> temp = new ArrayList<>();
//        for (String key : list) {
//            String[] split = key.split("-");
//            switch (split[0]) {
//                case "J":
//                    temp.add(String.valueOf(11) + "-" + split[1]);
//                    break;
//                case "Q":
//                    temp.add(String.valueOf(12) + "-" + split[1]);
//                    break;
//                case "K":
//                    temp.add(String.valueOf(13) + "-" + split[1]);
//                    break;
//                case "A":
//                    temp.add(String.valueOf(14) + "-" + split[1]);
//                    break;
//                default:
//                    temp.add(key);
//                    break;
//            }
//        }
//        System.out.println(temp);
//        List<Integer> 排序算法 = new ArrayList<>();
//        for (String key : temp) {
//            排序算法.add(Integer.parseInt(key.split("-")[0]));
//        }
//        Collections.排序算法(排序算法);
//        System.out.println(排序算法);
//        Set<String> huase = new HashSet<>();
//        Map<String, Integer> map = new HashMap<>();
//        for (String s : temp) {
//            String[] split = s.split("-");
//            huase.add(split[1]);
//            map.put(split[0], map.containsKey(split[0]) ? map.get(split[0]) + 1 : 1);
//        }
//        System.out.println("花色 ==> "+ huase);
//        System.out.println(map);
//        if (排序算法.get(0) + 1 == 排序算法.get(1) && 排序算法.get(1) + 1 == 排序算法.get(2) && 排序算法.get(2) + 1 == 排序算法.get(3) && 排序算法.get(3) + 1 == 排序算法.get(4)) {
//            if (huase.size() == 1) {
//                System.out.println("同花顺");
//                return;
//            }
//            System.out.println("顺子");
//            return;
//        } else {
//            if (huase.size() == 1) {
//                System.out.println("同花");
//                return;
//            }
//        }
//        if (map.size() == 2) {
//            boolean flag = true;
//            boolean flag2 = true;
//            for (String key : map.keySet()) {
//                if (map.get(key) == 4) {
//                    flag = false;
//                }
//                if (map.get(key) == 3) {
//                    flag2 = false;
//                }
//            }
//            if (!flag) {
//                System.out.println("四带一");
//                return;
//            }
//            if (!flag2) {
//                System.out.println("三带一对");
//                return;
//            }
//        }
//
//        if (map.size() == 3) {
//            boolean flag = true;
//            for (String key : map.keySet()) {
//                if (map.get(key) == 3) {
//                    flag = false;
//                }
//            }
//            if (!flag) {
//                System.out.println("三条");
//                return;
//            }
//        }
//        System.out.println("其他");
//
//    }

    /**
     * 给定一个正整数，给出消除重复数字以后最大的整数
     * 输入描述:
     * 正整数，注意考虑长整数
     * 输出描述:
     * 消除重复数字以后的最大整数
     * 示例1
     * 输入
     * 423234
     * 输出
     * 432
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        long n = scanner.nextLong();
//        String str = String.valueOf(n);
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//        List<Integer> list = new ArrayList<>();
//        for (char c : set) {
//            list.add(Integer.valueOf(String.valueOf(c)));
//        }
//        Collections.排序算法(list);
//        Collections.reverse(list);
//        System.out.println(list);
//    }

    /**
     * 题目描述:
     * 给定长度小于100的一个字符串,区分大小写的情况下统计其中字母的个数,并按照由大到小的顺序输出.当字母个数一样时,按照把先出现的字母放在前面.当字符串中没有字母时,则不要输出.
     * 举例:
     * 输入:
     * abbbdcdc123
     * 输出:
     * b=3
     * d=2
     * c=2
     * a=1
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
//        }
//        System.out.println(map);
//    }

    /**
     * 题目描述
     * 假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
     * 输入描述:
     * 输入起始高度，int型
     * <p>
     * 输出描述:
     * 分别输出第5次落地时，共经过多少米 第5次反弹多高
     * <p>
     * 示例1
     * 输入
     * 1
     * 输出
     * 2.875
     * 0.03125
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        int temp = h;
//        double high = 0;
//        for (int i = 3; i <= 5; i++) {
//            high += h * Math.pow(0.5, i - 2);
//        }
//        high += 2 * h;
//        System.out.println(high);
//        System.out.println(temp * Math.pow(0.5, 5));
//    }n
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int high = in.nextInt();
//            System.out.println(getJourney(high));
//            System.out.println(getTenthHigh(high));
//        }
//    }
//
//    public static double getJourney(int high) {
//        double highSum = 0;
//        double high1 = high;
//        for (int i = 1; i <= 5; i++) {
//            highSum += high1 + high1 / 2;
//            high1 /= 2;
//        }
//        highSum -= high1;
//        return highSum;
//    }
//
//    public static double getTenthHigh(int high) {
//        double high1 = high;
//        for (int i = 1; i <= 5; i++) {
//            high1 /= 2;
//        }
//        return high1;
//    }


    /**
     * 题目描述
     * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
     * 她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
     * 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，
     * 喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
     * 输入描述:
     * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），
     * 表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
     * <p>
     * 输出描述:
     * 对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
     * <p>
     * 示例1
     * 输入
     * 3
     * 10
     * 81
     * 0
     * 输出
     * 1
     * 5
     * 40
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }
//        System.out.println(list);

        for (int n : list) {
            int count = count(n);
            System.out.println(count);
        }

    }

    /**
     * @param n 空汽水瓶数量
     * @return 最多可换汽水瓶数量
     */
    private static int count(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return count(n - 2) + 1;
    }


}


