package org.example;

public class Primenumber {
    public static void main(String[] args) {
        int num=21;
        int temp=0;
        for(int i=2; i<num; i++){
            if (num % i == 0) {
                temp= temp+1;
            }
        }
        if (temp==0){
            System.out.println("prime number");
        }else {
            System.out.println("not prime number");
        }
    }
}
