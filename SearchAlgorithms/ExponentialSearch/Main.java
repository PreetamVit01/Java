package SearchAlgorithms.ExponentialSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,4,5,8,10,45,64,74,80,91,99,100,162,190,201};
        int target = 100;
        int n = arr.length;
        if(arr[0] == target){
            System.out.println("Target Found");
            return;
        }
        int i=1;
        while(i<n && arr[i]<=target){
            i *= 2;
        }
        int index = Arrays.binarySearch(arr,i/2,Math.min(i,n-1),target);
        if(index >= 0){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target not Found");
        }
    }
}
