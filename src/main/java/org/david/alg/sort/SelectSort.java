package org.david.alg.sort;

import org.david.alg.utils.Utils;

import java.util.Arrays;

/**
 * @author david
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 6, 7, 3, 9, 0};
        selectSort(arr);
        Utils.printArray(arr);
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int t = i + 1; t < arr.length; t++) {
                if (arr[min] > arr[t]) {
                    min = t;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
