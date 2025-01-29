package SEARCHINGS;

public class linearsearch2 {
    public static void main(String[] args) {
        int[] arr = {23, 34, 1, 67, 12};
        int target = 1;

        // Call the linearsearch method and store the result
        int result = linearsearch(arr, target);

        // Print the result
        System.out.println(result);
    }

    // Define the linearsearch method outside the main method
    public static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // Return -1 if the array is empty
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) { // Use '==' for comparison
                return i; // Return the index if the element matches the target
            }
        }

        return -1; // Return -1 if the target is not found
    }
}
