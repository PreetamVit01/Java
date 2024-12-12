package SearchAlgorithms.TernarySearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 10, 15, 16, 20, 45, 90, 103, 200};
        int target = 4;
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid1 = left + (right-left)/3;
            int mid2 = right - (right-left)/3;
            if(arr[mid1] == target || arr[mid2] == target) {
                System.out.println("Target Found");
                return;
            }
            else if(arr[mid1] > target){
                right = mid1 - 1;
            }
            else if(arr[mid2] < target){
                left = mid2 + 1;
            }
            else if(arr[mid1] < target && arr[mid2] > target){
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        System.out.println("Target Not Found");
    }
}
