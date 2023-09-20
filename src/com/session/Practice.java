package com.session;


import java.util.Objects;
public class Practice {
    public static void main(String[] args) throws Exception {
        String name="L26";
        if(name.contains(name)){
            System.out.println("exist");
        }

    }

    private static void method1() {
        method2();

    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        int a = 10 / 0;
        System.out.println(a);
    }

}
