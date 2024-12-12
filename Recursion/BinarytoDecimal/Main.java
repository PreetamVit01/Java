package Recursion.BinarytoDecimal;

public class Main {

    static String binNum = "";

    public static int solution1(int decimal){
        if(decimal == 0) {
            return 0;
        }
        return (decimal%2) + 10*solution1(decimal/2);
    }

    public static void solution2(int decimal){
        if(decimal <= 1) {
            binNum += (char)(decimal+'0');
        }
        else{
            solution2(decimal/2);
            if(decimal%2 != 0){
                binNum += '1';
            }
            else{
                binNum += '0';
            }
        }
    }

    public static void main(String[] args) {
        int deciaml = 1023;
        System.out.println(solution1(deciaml));
        solution2(5000);
        System.out.println(binNum);
    }

}
