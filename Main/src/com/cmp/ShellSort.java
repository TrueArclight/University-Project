package com.cmp;

public class ShellSort {
    public static void sortArray(int[] Arr) {
        ShellSort.shellSort(Arr);
    }
    public static void shellSort(int[] arr)
    {
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                for (int j = i - step; j >= 0 && arr[j] > arr[j + step] ; j -= step) {
                    int x = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = x;
                }
            }
        }
    }
}
