package org.example.arrays;

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args){
       /* int [] marks= new int[3];
        marks[0]=5;
        marks[1]=8;
        marks[2]=25; */
        //int[] marks={23,34,45};
        //user difined array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size= sc.nextInt();
        int marks[]=new int[size];
        int num=34;
        System.out.println("Enter number");
        for (int i = 0; i <size ; i++) {
            marks[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if(num==marks[i]){
                System.out.println("index number is: " +i);
            }
        }
    }
}
