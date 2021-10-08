package com.test;


public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {2,6,7,9,4};
        System.out.println("调用前arr[2] = " + arr[2]);//7
        change(arr);
        System.out.println("调用后arr[2] = " + arr[2]);//666

    }
    public static void change(int[] arr) {
        arr[2] = 666;
    }
}
