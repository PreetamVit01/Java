package Recursion.Print1toN;

import java.util.Scanner;

public class Main {

    public static void print1toN(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input is "+n);
        System.out.print("Output is ");
        print1toN(n);
    }
}
