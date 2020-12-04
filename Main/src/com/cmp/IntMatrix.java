package com.cmp;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class IntMatrix {
    private static int[] lineMatrix;
    private final int n;
    private final int m;

    public IntMatrix(int[] lineMatrix, int n, int m) {

        if (n < 0 || m < 0 || lineMatrix.length != n * m)
            throw new IllegalArgumentException();
        this.lineMatrix = lineMatrix.clone();
        this.n = n;
        this.m = m;
    }
    public void quickSort() {
        QuickSort.sortArray(lineMatrix);
    }
    public void selectionSort() {
        SelectionSort.sortArray(lineMatrix);
    }
    public void mergeSort() {
        MergeSort.sortArray(lineMatrix);
    }
    public void insertionSort() {
        InsertionSort.sortArray(lineMatrix);
    }
    public void bubbleSort() {
        BubbleSort.sortArray(lineMatrix);
    }
    public static TableModel fillMatrixByRandomValues(IntMatrix matrix, int rows, int cols) {
        Random random = new Random();
        int[][] arraylist = new int[rows][cols];
        Object[][] arrlist = new String[rows][cols];
        Object[] arrcols = new String[cols];
        int k =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arraylist[i][j] = random.nextInt(1000);
                arrlist[i][j]=Integer.toString(arraylist[i][j]);
                lineMatrix[k++] = arraylist[i][j];
            }
        }
        return new DefaultTableModel(arrlist,arrcols);
    }
    public static TableModel printMatrix(IntMatrix matrix,int rows, int cols) {
        int[][] arraylist = new int[rows][cols];
        Object[][] arrlist = new String[rows][cols];
        Object[] arrcols = new String[cols];
        int k =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arraylist[i][j] = lineMatrix[k++];
                arrlist[i][j]=Integer.toString(arraylist[i][j]);
            }
        }
        return new DefaultTableModel(arrlist,arrcols);
    }
}
