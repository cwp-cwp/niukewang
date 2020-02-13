package com.cwp.基础部分;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

/**
 * 1.求数组元素的最大值、最小值、平均数、总和等
 * <p>
 * 2.数组的复制、反转
 * <p>
 * 3.数组元素的排序
 */
public class 数组 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 43, 9, 0, -65, -99, 100, 9};

        // 最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("数组的最大值为：" + max);

        // 最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("数组的最小值为：" + min);

        // 总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);

        // 平均数
        int avg = 0;
        avg = sum / arr.length;
        System.out.println("平均值为：" + avg);

        // 数组的复制
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        // 数组元素的反转
        // for(int i = 0;i < arr.length/2;i++){
        // int temp = arr[i];
        // arr[i] = arr[arr.length-1 - i];
        // arr[arr.length - 1 - i] = temp;
        // }
        for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        System.out.println("反转以后：");
        // 遍历

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // // 使用冒泡排序使数组元素从小到大排列
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // //使用直接选择排序使数组元素从小到大排列
        // for(int i = 0; i < arr.length - 1; i++){
        // int t = i;//默认i处是最小的
        // for(int j = i;j < arr.length;j++){
        // //一旦在i后发现存在比其小的元素，就记录那个元素的下角标
        // if(arr[t] > arr[j]){
        // t = j;
        // }
        // }
        // if(t != i){
        // int temp = arr[t];
        // arr[t] = arr[i];
        // arr[i] = temp;
        // }
        // }
        Arrays.sort(arr);

        System.out.println("排序以后：");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    /**
     * 除去数组中重复元素
     */
    @Test
    public void test1() {
        int arr[] = new int[]{1, 2, 2, 3, 4, 4, 5, 3, 6, 8, 7, 6};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
