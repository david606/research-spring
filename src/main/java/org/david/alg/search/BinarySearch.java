package org.david.alg.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8};
        System.out.println(binarySearch(arr, 6));
    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
