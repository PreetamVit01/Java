package Recursion.PrintNto1;

import java.util.Scanner;

public class Main {
    public static void printNto1(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input is "+n);
        System.out.print("Output is ");
        printNto1(n);
    }
}
