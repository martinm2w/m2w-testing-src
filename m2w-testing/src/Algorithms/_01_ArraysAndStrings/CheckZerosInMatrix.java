/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class CheckZerosInMatrix {
    public static void main(String[] args){
        CheckZerosInMatrix czim = new CheckZerosInMatrix();
        int[][] matrix = {{1,2,4},{3,0,3}, {4,6,0}, {7,8,9}};
        czim.setZeros(matrix);
    }
    
    public int[][] setZeros(int[][] matrix){
	int[] rows = new int[matrix.length];
	int[] columns = new int[matrix[0].length];
	System.out.println("before");
	for(int i = 0; i < matrix.length; i++){
		for(int j = 0; j < matrix[0].length; j ++){
			if(matrix[i][j] == 0){
				rows[i] = 1;
				columns[j] = 1;
                        }
                        System.out.print(matrix[i][j]);
                }
                System.out.println();
	}
	//set zeros.
        System.out.println("after");
	for(int i = 0 ; i < rows.length; i ++){
		for(int j = 0; j < columns.length; j++){
			if(rows[i] == 1 || columns[j] ==1){
				matrix[i][j] = 0;
                        }
                        System.out.print(matrix[i][j]);
                }
                System.out.println();
	}	
	
	return matrix;
        }
    
}
