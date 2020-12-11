package leetcode766;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		
		System.out.println("Matrix: " + Arrays.deepToString(matrix));
		
		CheckIfToeplitzMatrix solution = new CheckIfToeplitzMatrix();
		
		System.out.println("Solution: " + solution.isToeplitzMatrix(matrix));
	}
}
