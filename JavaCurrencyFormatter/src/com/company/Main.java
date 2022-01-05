package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance();
        String us = usFormat.format(payment);

        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String in = inFormat.format(payment);

        NumberFormat chFormat = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String ch = chFormat.format(payment);

        NumberFormat frFormat = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        String fr = frFormat.format(payment);

        System.out.println(us);
        System.out.println(in);
        System.out.println(ch);
        System.out.println(fr);

    }


}