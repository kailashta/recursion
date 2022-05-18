package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        System.out.println(recursion(n));
    }

    public static int  recursion(int n){
        if(n==0){
            return 0;
        }
        return n+=recursion(n-1);
    }
}
