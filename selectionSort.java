package SORTINGS;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 7, 5};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Selection sort implementation
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    // Method to get the index of the maximum element
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Method to swap two elements
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
