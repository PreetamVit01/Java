package Recursion.SumofNaturalNumbers;

public class Main {

    public static int sumOfNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        return sumOfNaturalNumbers(n-1)+n;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumOfNaturalNumbers(n));
    }
}
