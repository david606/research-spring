package org.david.alg.sort;

import org.david.alg.utils.Utils;

/**
 * @author david
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 4, 6, 7, 3, 2, 1, 23, 223, 1, 23, 54, 675, 8};
        bubbleSort(arr);
        Utils.printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            /*
             * 每一轮循环，最大的元素都会交换到尾部。所以，下一次循环的部分，就会是 [0~(length-i)]
             * 如 第一轮最大元素 675，到最末
             * 尾；第二轮次最大元素223 到675前面。
             */
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    }
}
