package com.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;

public class AamirKhan {
    public static void main(String[] args) throws IOException {
        Timestamp timestamp = null;
        while (true) {
            String continueProgram;
            int outPut = 0, input = 0, swap = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number");
            input = Integer.parseInt(br.readLine());
            swap = input;
            for (int i = 1; i <= swap; i++) {
                outPut += input;
            }
            System.out.println(outPut);
            System.out.println("if want to continue the program then press Y");
            continueProgram = String.valueOf(br.readLine());
            if (continueProgram.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
