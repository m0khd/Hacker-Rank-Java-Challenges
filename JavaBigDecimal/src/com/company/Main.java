package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                String temp = "";
                BigDecimal bdI = new BigDecimal(s[i]);
                BigDecimal bdJ = new BigDecimal(s[j]);
                if (bdI.compareTo(bdJ) > 0) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}
