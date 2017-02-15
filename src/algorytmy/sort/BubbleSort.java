package algorytmy.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};

        int[] ascSortedArray = bubbleSort.ascSort(array);
        System.out.println("ASC " + Arrays.toString(ascSortedArray));

        int[] descSortedArray = bubbleSort.descSort(array);
        System.out.println("DESC " + Arrays.toString(descSortedArray));

    }

    public int[] descSort(int[] array) {
        int counter = 0;
        boolean flag;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                counter++;
                if(array[j] < array[j+1]) {
                    SortUtils.swap(array, j, j+1);
                    flag = false;
                }
            }
        }
        System.out.println(counter);
        return array;
    }

    public int[] ascSort(int[] array) {
        int counter = 0;
        boolean flag;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                counter++;
                if(array[j] > array[j+1]) {
                    SortUtils.swap(array, j, j+1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }




    /*procedure bubbleSort( A : lista elementów do posortowania )
    n = liczba_elementów(A)
   do
           for (i = 0; i < n-1; i++) do:
            if A[i] > A[i+1] then
    swap(A[i], A[i+1])
    end if
    end for
    n = n-1
            while n > 1
    end procedure*/
}
