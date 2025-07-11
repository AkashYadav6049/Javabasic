package org.example.function;

import java.util.Scanner;

public class Oddnumber {

    public static void odd(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        odd(n);
    }
}
