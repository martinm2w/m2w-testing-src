///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package Algorithms.Sort;
//
///**
// *
// * @author ruobo
// */
//public class MergeSort {
//    
//    public static void main(String[] args){
//        int[] input = {3,2,5,4,1,6};
//        MergeSort ms = new MergeSort();
//        int[] temp = new int[input.length] ;
//        input = ms.mergeSort(input, temp, 0, 5);
//        
//        for(int i : input){
//            System.out.print(i);
//        }
//        System.out.println();
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
//}
