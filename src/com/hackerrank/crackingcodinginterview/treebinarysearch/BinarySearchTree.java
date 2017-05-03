package com.hackerrank.crackingcodinginterview.treebinarysearch;

/**
 * Created by cfeng01 on 28/04/17.
 */
public class BinarySearchTree {
/*
    The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
    }
*/
    boolean checkBST(Node root) {
        boolean result=false;
        if(root.left!=null){
            if(root.left.data < root.data){
                result=checkBSTLeft(root.data, root.left);
            }else{
                // nope, it is wrong
                result=false;
            }
        }else if (root.right!=null){
            if(root.right.data > root.data){
                result=checkBSTRight(root.data, root.right);
            }else{
                // nope, it is wrong
                result=false;
            }
        }else{
            result=true;
        }
        return result;
    }

    private boolean checkBSTLeft(int currentNodeVal, Node leftSubNode) {
        boolean result=false;
        if (leftSubNode.data < currentNodeVal){
            result=true;
            if (leftSubNode.left!=null)
                result=checkBSTLeft(leftSubNode.data, leftSubNode.left);
            if (result && leftSubNode.right!=null)
                result=checkBSTRight(leftSubNode.data, leftSubNode.right);
        }else{
            result=false;
        }
        return result;
    }

    private boolean checkBSTRight(int currentNodeVal, Node rightSubNode) {
        boolean result=false;
        if (rightSubNode.data > currentNodeVal){
            result=true;
            if (rightSubNode.left!=null)
                result=checkBSTLeft(rightSubNode.data, rightSubNode.left);
            if (rightSubNode.right!=null)
                result=checkBSTRight(rightSubNode.data, rightSubNode.right);
        }else{
            result=false;
        }
        return result;
    }

}
