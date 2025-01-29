package SEARCHINGS;

import java.util.Arrays;

public class rowcolIndex {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 5, 6, 9},
            {23, 34, 39, 45},
            {50, 66, 72, 89},
        };
        int target = 66;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return null;  // Return null if the target is not found
    }
}

