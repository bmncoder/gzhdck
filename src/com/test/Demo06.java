package com.test;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("请输入arr1数组长度：");
//        int a1 = scanner.nextInt();
//        int[] arr1 = new int[a1];
//        System.out.println("请输入数组数据：");
//        scArray(arr1);
//
//        System.out.println("请输入arr2数组长度：");
//        int a2 = scanner.nextInt();
//        int[] arr2 = new int[a2];
//        System.out.println("请输入数组数据：");
//        scArray(arr2);
//
//        System.out.print("arr1:");
//        printArray(arr1);
//        System.out.print("arr2:");
//        printArray(arr2);
//
//        compare(arr1,arr2);
//
//        System.out.println("判断数组是否相同：");
//        System.out.println(compare(arr1,arr2));

        System.out.println("请输入arr数组长度：");
        int a1 = scanner.nextInt();
        int[] arr = new int[a1];
        System.out.println("请输入数组数据：");
        scArray(arr);
        printArray(arr);
        System.out.println("反转后为：");
        reverse(arr);
        printArray(arr);

    }

    /**
     * 数组反转
     * @param arr
     */
    public static void reverse(int[] arr){
        for (int start = 0, end = arr.length -1; start <= end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    /**
     * 比较两个数组是否相同
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean compare(int[] arr1,int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }



    /**
     * 打印数组
     * @param arr
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }

    /**
     * 数组赋值
     * @param arr
     */
    public static void scArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}
