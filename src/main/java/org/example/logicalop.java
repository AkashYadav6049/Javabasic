package org.example;

public class logicalop {
    public static void main(String[] args) {
        int x=23,a=34;
        int y=45,b=22;
        boolean c= x<y & a<b;
        System.out.println(c);
        //ternary operator
        int result=0;
        result=b%2==0 ?10:20;
        System.out.println(result);

    }
}
