package SEARCHINGS;

public class miniNO {
    public static void main(String[] args) {
        int[] arr = {34, 2, 56, 12, 3}; // Missing semicolon fixed
        System.out.println(min(arr));  // Call the min function
    }

    // Method to find the minimum element in an array
    static int min(int[] arr) {
        int ans = arr[0]; // Initialize the minimum with the first element
        for (int i = 1; i < arr.length; i++) { // Iterate through the array
            if (arr[i] < ans) { // Update the minimum if a smaller element is found
                ans = arr[i];
            }
        }
        return ans; // Return the minimum value
    }
}
