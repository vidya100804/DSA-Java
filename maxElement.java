package SEARCHINGS;

import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 2, 4, 9, 12, 1,99};
        int start = 0;
        int end = arr.length - 1;
        int result = maxi(arr, start, end);
        System.out.println("The Max Element:"+arr[result]+"\n The Element found at index:"+result);
    }

    static int maxi(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
