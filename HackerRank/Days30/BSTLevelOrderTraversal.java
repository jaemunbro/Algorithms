package HackerRank.Days30;

import java.util.*;
import java.io.*;
import java.util.LinkedList;

/**
 * Day 23: BST Level-Order Traversal(breadth-first search)
 *
 * Task
 * A level-order traversal, also known as a breadth-first search,
 * visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer, root,
 * pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.
 *
 * Hint: You'll find a queue helpful in completing this challenge.
 */

class BSTNode{
    BSTNode left,right;
    int data;
    BSTNode(int data){
        this.data=data;
        left=right=null;
    }
}

class BSTLevelOrderTraversal{

    static void levelOrder(BSTNode root){
        //Write your code here
        Queue<BSTNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            BSTNode current = que.remove();
            System.out.print(current.data);
            if(current.left!=null) que.add(current.left);
            if(current.right!=null) que.add(current.right);
        }


        /*
        Queue<BSTNode> BSTQ = new PriorityQueue<>();

        List<Integer> BSList = new ArrayList<>();
        List<BSTNode> TempList = new ArrayList<>();

        BSList.add(root.data);

        if(root.left != null || root.right != null) {
            if(root.left != null){
                TempList.add(root.left);
                root = root.left;
            if(root.right != null)
                TempList.add(root.right);
        }
        */

    }

    public static BSTNode insert(BSTNode root,int data){

        if(root==null){
            return new BSTNode(data);
        }

        else{
            BSTNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BSTNode root=null;

        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }

        levelOrder(root);
    }
}
