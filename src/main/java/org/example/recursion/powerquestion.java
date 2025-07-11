package org.example.recursion;

public class powerquestion {
    static void power(int a,int  b,int multi){
        if (b==1){
            multi*=a;
            System.out.println(multi);
            return ;
        }
         multi *=a;
         power(a,b-1,multi);
    }


    public static void main(String[] args) {
        int a=2;
        int b=6;
        power(a,b,1);
    }
}
