package com.hackerrank.crackingcodinginterview;

/**
 * Created by cfeng01 on 28/04/17.
 */
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int val){
            data=val;
        }

        public void insert(int val){
            if (val<data){
                if(left==null){
                    left = new Node(val);
                }else{
                    left.insert(val);
                }
            }else /* var>data */ {
                if(right==null){
                    right = new Node(val);
                }else{
                    right.insert(val);
                }
            }
        }
    }