package SORTINGS;

import java.util.Arrays;

import java.util.Arrays;

public class bubblesort {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 4, 3};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}