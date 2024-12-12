package Recursion.MeanOfArray;

import java.util.Scanner;

public class Main {

    public static float meanOfArray(int[] arr, int N) {
        if(N==1){
            return (float)arr[N-1];
        }
        return ((float)(meanOfArray(arr, N-1)*(N-1)+arr[N-1])/N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mean of input array: "+meanOfArray(arr, size));
    }
}
