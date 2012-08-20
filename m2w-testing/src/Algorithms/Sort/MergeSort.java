/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ruobo
 */
public class MergeSort {
    
    public static void main(String[] args){
        int[] input = {2,2,4,1,5,5};
        MergeSort ms = new MergeSort();
        int head = 0;
        int tail = input.length-1;
        ms.merge_sort(input, head, tail);
        for(int i : input)
            System.out.print(i);
        System.out.println();
    }
    
    public void merge_sort(int[] input, int head, int tail){
        int mid = (head+tail)/2;
        if(head < tail){
            merge_sort(input, head, mid);
            merge_sort(input, mid+1, tail);
            merge(input, head, tail, mid);
        }
    }

    private void merge(int[] input, int head, int tail, int mid){
            int[] headArr = new int[mid-head+1+1];
            int[] tailArr = new int[tail-mid+1]; // +1 for sentinel
            for(int i=0; i<headArr.length-1; i++){
                    headArr[i] = input[head+i];
            }
            for(int i=0; i<tailArr.length-1; i++){
                    tailArr[i] = input[mid+i+1];
            }
            headArr[headArr.length-1] = Integer.MAX_VALUE;
            tailArr[tailArr.length-1] = Integer.MAX_VALUE;
            int i = 0;
            int j = 0;
            for(int k = head; k <= tail; k++){//loop twice at base
                    if(headArr[i] < tailArr[j]){
                            input[k] = headArr[i++];
                    }else{
                            input[k] = tailArr[j++];
                    }
            }
    }
    
    
//    /**
//     * m2w: prepare and wrapper method
//     */
//    private void mergeSort(int[] input){
//        int head = 0;
//        int tail = input.length-1;
//        this.mergeSort_(input, head, tail);
//        for(int i : input){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//    }
//    
//    private void mergeSort_(int[] input, int head, int tail){
//        System.out.println(head+"-"+tail);
//        if(head < tail){//is < because if == then only 1 item. no return because everything is stored in input array after recursion.
//            int mid = (head+tail)/2;
////            System.out.println("mid: " + mid);
//            mergeSort_(input, head, mid);
//            mergeSort_(input, mid+1, tail);
//            merge(input, head, tail, mid);
//        }
//    }
//    
//    private void merge(int[] input, int head, int tail, int mid){
//        int[] headArray = new int[mid-head+1+1];
//        int[] tailArray = new int[tail-mid+1];
//        //copy arrays
//        for(int i = 0; i < headArray.length-1; i++){
//            headArray[i] = input[head+i];
//        }
//        for(int i = 0; i < tailArray.length-1; i++){
//            tailArray[i] = input[i+mid+1];
//        }
//        headArray[headArray.length-1] = Integer.MAX_VALUE;
//        tailArray[tailArray.length-1] = Integer.MAX_VALUE;
//        
//        System.out.print("head arr: ");
//        for(int i : headArray){
//            System.out.print(i+",");
//        }
//        System.out.println();
//        System.out.print("tail arr: ");
//        for(int i : tailArray){
//            System.out.print(i+",");
//        }
//        System.out.println();
//        
//        int i = 0;
//        int j = 0;
//        //the most important idea is that merging is done in the input array.
//        //the devide part is only done through the variable, no need to pass down splited array.
//        //very important thing is that k has to loop twice at the base case. or only 1 of the 2 leaves will be saved.
//        //    and to do that have to make a sentinel entry to protect from index out of bound and complete the compare.
//        for(int k = head; k <= tail ; k++){
//            System.out.println(i+" "+j+ ", K: " + k);
//            if(headArray[i] <= tailArray[j]){
//                input[k] = headArray[i++];
//                System.out.println("i:" + i);
//            }else{
//                input[k] = tailArray[j++];
//                System.out.println("j:" + j);
//            }
//        }
//        for(int z : input){
//            System.out.print(z);
//        }
//        System.out.println();
//        
//    }
    
    
    
//    private void mergeSort(int[] input, int[] temp, int left, int right){
//        if(left < right){
//            int mid = (left + right) /2 ; //2
////            System.out.println(left + " " + mid + " " + right);
//            mergeSort(input, temp, left, mid);
//            mergeSort(input, temp, mid + 1, right);
//            merge(leftArr, rightArr);
//        }else{
//            return;
//        }
//    }
//    
//    private int[] merge(int[] A, int[] B){
//        int i = 0;
//        int j = 0;
//        int [] merged = new int[A.length + B.length];
//        int index = 0;
//        while(i != A.length && j != B.length){
//            if(A[i] <= B[j]){
//                merged[index++] = A[i++]; //A[i] is stored
//            }else{
//                merged[index++] = B[j++]; //B[j] is stored
//            }
//        }
//        if(i != A.length){
//            for(int m = i; m < A.length; ++m){
//                merged[index++] = A[m];
//            }
//        }
//        if(j != B.length){
//            for(int m = j; m < B.length; ++m){
//                merged[index++] = B[m];
//            }
//        }
//        return merged;
//    }
}
