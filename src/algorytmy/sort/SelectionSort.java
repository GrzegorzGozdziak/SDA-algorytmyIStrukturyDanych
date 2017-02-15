package algorytmy.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, -2, 3, -4, 5, -6, 8, 7};
        System.out.println("ASC: " + Arrays.toString(selectionSort.ascSort(array)));
        System.out.println("DESC: " + Arrays.toString(selectionSort.descSort(array)));
    }

    public int[] ascSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMin = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[indexOfMin] < array[j]) {
                    indexOfMin = j;
                }
            }
            SortUtils.swap(array, indexOfMin, array.length - i - 1);
        }
        return array;
    }

    public int[] descSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMax = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[indexOfMax] > array[j]) {
                    indexOfMax = j;
                }
            }
            SortUtils.swap(array, indexOfMax, array.length - i - 1);
        }
        return array;
    }
}
