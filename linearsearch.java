package SEARCHINGS;

import java.util.Scanner;

public class linearsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        // Declare and initialize the array
        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element
        System.out.println("Enter the target element:");
        int k = sc.nextInt();

        // Perform linear search
        int result = linearsearch(arr, n, k);

        // Print result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }

    // Linear search method
    public static int linearsearch(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}
