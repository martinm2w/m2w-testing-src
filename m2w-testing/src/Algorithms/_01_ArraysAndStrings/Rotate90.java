/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms._01_ArraysAndStrings;

/**
 *
 * @author ruobo
 */
public class Rotate90 {
    public static void main(String[] args){
        int[][] pic = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("in");
        for(int[] a : pic){
            for(int b : a){
                System.out.print(b + "\t");
            }
            System.out.println();
        } 
        Rotate90 r9 = new Rotate90();
        r9.rotate90(pic);
        System.out.println("out");
        
        for(int[] a : pic){
            for(int b : a){
                System.out.print(b + "\t");
            }
            System.out.println();
        } 
    }
    
    
    public int[][] rotate90(int[][] pic){
	if(pic == null ) return null;
	if(pic.length != pic[0].length) return pic;
        int n = pic.length;
        for(int y = 0; y < n/2; y ++){
                for(int x = y; x < n - y - 1;  x ++){
                    System.out.println(y + " " + x);
                        int temp1 = pic[y][n-x-1];
                        pic[y][n-x-1] = pic[x][y];
                        int temp2 = pic[n-x-1][n-y-1];
                        pic[n-x-1][n-y-1] = temp1;
                        temp1 = pic[n-y-1][x];
                        pic[n-y-1][x] = temp2;
                        pic[x][y] = temp1;
                }
        }
        return pic;
    }
    
    public static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                // left -> top
                matrix[first][i] = matrix[last-offset][first]; 			
                 // bottom -> left
                 matrix[last-offset][first] = matrix[last][last - offset];
                 // right -> bottom
                 matrix[last][last - offset] = matrix[i][last];
                 // top -> right
                 matrix[i][last] = top; // right <- saved top
            } 
        } 
    } 
}
