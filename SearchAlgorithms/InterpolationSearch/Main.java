package SearchAlgorithms.InterpolationSearch;

public class Main {

    public static boolean interpolation(int[] array, int target){
        int low = 0;
        int high = array.length-1;
        while(array[low] <= target && array[high] >= target && low <= high){
            int probe = low + (high-low)*(target-array[low])/(array[high]-array[low]);
            System.out.println("Probe : "+probe);
            if(array[probe] > target){
                high = probe-1;
            }
            else if(array[probe] < target){
                low = probe+1;
            }
            else if(array[probe] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,60,90,120};
        int target = 10;
        if(interpolation(array,target)){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target not Found");
        }
    }
}
