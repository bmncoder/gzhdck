package com.test;

public class Demo04 {
    public static void main(String[] args) {//斐波那契数列
        int[] rabbit = new int[20];
        rabbit[0] = 1;
        rabbit[1] = 1;

        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i] = rabbit[i-1] + rabbit[i-2];
        }
        System.out.println("二十个月后兔子个数：");
        System.out.println(rabbit[19]);
    }
}
