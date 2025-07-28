public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int buttom = matrix.length - 1;
        while (top <= buttom) {
            int midRow = top + (buttom - top) / 2;
            if (target < matrix[midRow][0]) {
                buttom = midRow - 1;
            } else if (target > matrix[midRow][matrix[0].length - 1]) {
                top = midRow + 1;
            } else {
                return binarySearch(matrix[midRow], target);
            }
        }
        return false;
    }

    private boolean binarySearch(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (target < row[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchA2DMatrix solution = new SearchA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println("Target found: " + solution.searchMatrix(matrix, target));
    }
}
