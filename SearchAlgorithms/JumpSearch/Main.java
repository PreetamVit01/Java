package SearchAlgorithms.JumpSearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 10, 15, 16, 20, 45, 90, 103, 200};
        int n = arr.length;
        int target = 0;
        int left = 0;
        int right = arr.length - 1;
        int prev = 0;

        int step = (int)Math.floor(Math.sqrt(n));

        for(int minSteps = Math.min(step,n)-1; arr[minSteps] < target; minSteps = Math.min(step,n)-1){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev >= n) {
                System.out.println("Target Not Found");
                return;
            }
        }

        while(arr[prev] < target){
            prev++;
            if(prev == Math.min(step,n)){
                System.out.println("Target Not Found");
                return;
            }
        }

        if(arr[prev] == target){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target Not Found");
        }
    }
}
