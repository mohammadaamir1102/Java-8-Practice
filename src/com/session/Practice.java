package com.session;

<<<<<<< HEAD

import java.util.Objects;

public class Practice {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Catch block");
=======
public class Practice {
    public static void main(String[] args) throws Exception {
        String name="L26";
        if(name.contains(name)){
            System.out.println("exist");
>>>>>>> 85995503eb7a621d29e928562f060569bc7cdaa1
        }

    }

<<<<<<< HEAD
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

=======
>>>>>>> 85995503eb7a621d29e928562f060569bc7cdaa1
}
