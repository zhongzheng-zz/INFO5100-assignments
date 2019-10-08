package Q4;

import java.util.Arrays;

public class Matrix {
	public void matrixProduct(int[][] matrix1 , int[][] matrix2) {
		int[][] c = new int[matrix1.length][matrix2[0].length];
		for(int i=0; i<matrix1.length;i++) {
			for(int q = 0; q< matrix2[0].length; q++) {
				int b = 0;
				for(int p=0; p < matrix2.length; p++) {
					int a = matrix1[i][p] * matrix2[p][q];
					b = b + a;	
				}
				c[i][q]= b;	
			}
			
		}
		System.out.print(Arrays.deepToString(matrix1) + "x" + Arrays.deepToString(matrix2) + "=" );
		System.out.println(Arrays.deepToString(c));
		
	}	
	
	public static void main(String[] args) {
		int[][] matrix1 = new int[][] {{1,0,0}, {-1,0,3}};
		int[][] matrix2 = new int[][] {{7,0,0},{0,0,0},{0,0,1}};
		Matrix m = new Matrix();
		m.matrixProduct(matrix1, matrix2);

	}

}
