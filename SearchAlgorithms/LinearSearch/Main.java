package SearchAlgorithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int array[] = {10,70,20,80,30,40,100,50,60,90};
        int target = 10;
        for(int value : array){
            if(value == target){
                System.out.println("Target Found ");
                return;
            }
        }
        System.out.println("Target Not Found");
    }
}
