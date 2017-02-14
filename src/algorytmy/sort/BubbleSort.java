package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};

        int[] ascSortedArray = bubbleSort.ascBubbleSort(array);
        System.out.println("ASC " + Arrays.toString(ascSortedArray));

        int[] descSortedArray = bubbleSort.descBubbleSort(array);
        System.out.println("DESC " + Arrays.toString(descSortedArray));

    }

    public int[] descBubbleSort(int[] array) {
        int counter = 0;
        boolean flag;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                counter++;
                if(array[j] < array[j+1]) {
                    swap(array, j, j+1);
                    flag = false;
                }
            }
        }
        System.out.println(counter);
        return array;
    }

    public int[] ascBubbleSort(int[] array) {
        int counter = 0;
        boolean flag;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                counter++;
                if(array[j] > array[j+1]) {
                    swap(array, j, j+1);
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

    private void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
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
