/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.StacksAndQueues;

import java.util.Stack;

/**
 *
 * @author ruobo
 */
public class StackWithMin extends Stack<NodeWithMin> {
//    public class StackWithMin 
     public void push(int value) {
         int newMin = Math.min(value, min());
         super.push(new NodeWithMin(value, newMin));
     }
     public int min() {
         if (this.isEmpty()) {
             return Integer.MAX_VALUE;
         } else {
             return peek().min;
         }
     }
 }

 class NodeWithMin {
     public int value;
     public int min;
     public NodeWithMin(int v, int min){
         value = v;
        this.min = min;
     }
 }

