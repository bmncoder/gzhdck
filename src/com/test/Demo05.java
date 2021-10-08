package com.test;

public class Demo05 {
    public static void main(String[] args) {//百钱买百鸡
        int x;
        int y;
        int z;
        for (x = 0; x <= 20; x++) {
            for (y = 0; y <= 33; y++) {
                z = 100 - x - y;
                if (z%3==0 && 5*x+3*y+z/3==100){
                    System.out.println(x+" "+y+" "+z);
                }
            }
        }
    }
}
