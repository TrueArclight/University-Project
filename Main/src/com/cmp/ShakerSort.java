package com.cmp;

public class ShakerSort {
    public static void sortArray(int[] Arr) {
        ShakerSort.shakerSort(Arr);
    }
    public static void shakerSort(int arr[]) {
        int buff;
        int left = 0;
        int right = arr.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }
}
