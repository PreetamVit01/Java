package SearchAlgorithms.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 10, 15, 16, 20, 45, 90, 103, 200};
        int target = 200;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Target Found");
                return;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Target Not Found");
    }
}
