package org.example.recursion;

public class factorial {
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        int fact = factorial(n-1);
        int fact_n=n*fact;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        factorial(n);
        System.out.println(factorial(n));
    }
}
