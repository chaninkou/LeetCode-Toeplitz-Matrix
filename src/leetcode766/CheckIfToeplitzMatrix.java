package leetcode766;

public class CheckIfToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
    	// O(n) will return false if top-left != bottom-right
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]){
                    return false;
                } 
            }
        }
        
        return true;
    }
}
