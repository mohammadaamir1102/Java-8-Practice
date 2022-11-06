package com.session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CustomException extends Exception {
    CustomException(String ex) {
        super(ex);
    }
}
public class ExceptionProgram {
    public static void main(String[] args) throws IOException, CustomException {
        System.out.println("Enter the pin for getting cash !");
        final Integer PIN_NUMBER = 7860;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer pin = Integer.valueOf(br.readLine());
        if (pin.equals(PIN_NUMBER)) {
            System.out.println("Please take cash from the ATM !");
        } else {
            throw new CustomException("Wrong pin, Please use right pin !");
        }
        System.out.println("Thanks for visiting KOTAK BANK");
    }
}
