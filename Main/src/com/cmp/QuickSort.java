package com.cmp;

class QuickSort {
    public static void sortArray(int[] Arr) {
        QuickSort.quicksort(Arr, 0, Arr.length - 1);
    }
    public static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }
    public static void quicksort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quicksort(array, begin, pivot-1);
        quicksort(array, pivot+1, end);
    }
}
