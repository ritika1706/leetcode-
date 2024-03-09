class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRow = matrix.length;
        int numCol = matrix[0].length;

        // bsearch
        int start = 0; int end = numRow-1;
        while (start < end) {
            int mid = start + (end-start)/2;
            if (matrix[mid][0] <= target && target <= matrix[mid][numCol-1]) {
                start = mid;
                break; // stop here
            }
            if (matrix[mid][0] <= target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        int[] arr = matrix[start];
        start = 0; end = numCol-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] <= target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return false;
    }
}