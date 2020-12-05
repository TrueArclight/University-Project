package com.cmp;

public class GnomeSort {
    public static void sortArray(int[] Arr) {
        GnomeSort.gnomeSort(Arr);
    }
    public static void gnomeSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (i == 0 || arr[i - 1] <= arr[i])
                i++;
            else {
                int tmp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = tmp;
                i--;
            }

        }
    }
}
