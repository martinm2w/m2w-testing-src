/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms.TreesAndGraphs;

import java.util.ArrayList;
/**
 *
 * @author ruobo
 * @date Jan 4, 2012
 */
public class BasicTree {

    

    
}

interface Node {
//    ArrayList<Node>  children = null;
//    public Node (ArrayList<Node> children){
//        Node.children = children;
//    }
    int getNumChildren();

    Node getChild(int index);
}

class BasicNode implements Node{

    ArrayList<Node> children;

    public BasicNode(ArrayList<Node> children){
        this.children = children;
    }
    
    @Override
    public int getNumChildren(){
        return this.children.size();
    }

    @Override
    public Node getChild(int index){
        return this.children.get(index);
    }
}