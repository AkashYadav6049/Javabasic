package org.example.arrays;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=sc.nextInt();
        System.out.println("enter columns");
        int cols= sc.nextInt();
        int[][] num= new int[rows][cols];

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                num[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
