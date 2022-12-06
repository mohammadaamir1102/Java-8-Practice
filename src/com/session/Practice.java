package com.session;

import java.math.BigInteger;

public class Practice {

    public static void main(String[] args) {
        BigInteger biginteger = new BigInteger("2300");
        BigInteger val = new BigInteger("3400");

        // Call and() method to find this & val
        BigInteger biggerInteger = biginteger.and(val);
        System.out.println(biggerInteger);

    }
}

