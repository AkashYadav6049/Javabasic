package org.example.function;

import java.util.Scanner;

public class F1 {
    public static float average(int num1,int num2,int num3){
        float aver= (num1+num2+num3)/3;
        //System.out.println(aver);
        return aver;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(average(num1,num2,num3));


    }
}
