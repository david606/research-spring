package org.david.alg.sort;

import org.david.alg.utils.Utils;

/**
 * @author david
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 4, 6, 0};
        insertSort(arr);
        Utils.printArray(arr);
    }

    private static void insertSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            /*
             * 定义有序区间 [(z=i)~0]；与未排序区间(i~length]。
             * 未排序区间内每个元素与有序区间倒序元素对比，找到合适自己的位置，插入
             */
            for (int z = i; z > 0; z--) {
                if (arr[z] < arr[z - 1]) {
                    temp = arr[z];
                    arr[z] = arr[z - 1];
                    arr[z - 1] = temp;
                }
            }

        }
    }
}
