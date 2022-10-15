package com.session;

import java.util.Scanner;

public class RoundFigure {
    public static void main(String args[]) {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal number");
        num = sc.nextFloat();
        double sa = num * 100.0;
        double sah = sa / 10;
        double s = sah + 0.5;
        double sahi = s / 10;
        double sahil = sahi + 0.45;
        int rs = (int) sahil;
        System.out.println(rs);
    }
}
