package com.company;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();

        System.out.println(isProbablePrime(n));
    }

    static String isProbablePrime(BigInteger n) {

        if (n.intValue() < 2) {
            return "not prime";
        } else {
            for (int i =2; i<n.intValue(); i++) {
                if (n.intValue()%i == 0) {
                    return "not prime";
                }
            }
            return "prime";
        }
    }


}
