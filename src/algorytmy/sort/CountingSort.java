package algorytmy.sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] array = {1, -2, 3, 3, -4, 5, -6, 8, 7};
        int[] asc = countingSort.ascSort(array);
        System.out.println(Arrays.toString(asc));
//        int[] desc = countingSort.descSort(array);
//        System.out.println(Arrays.toString(desc));
    }

    public int[] ascSort(int[] array) {
        int max = SortUtils.max(array);
        int min = SortUtils.min(array);
        int range = max - min + 1;
        int[] rangeArray = new int[range];
        for (int i = 0; i < array.length; i++) {
            rangeArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = 0; j < rangeArray[i]; j++) {
                array[index] = i + min;
                index++;
            }
        }
        return array;
    }

    public int[] descSort(int[] array) {

        return null;
    }
}
