package HackerRank.Days30;


import java.util.*;
import java.io.*;

/**
 * DAY 22 : Binary Search Trees
 *
 * Task
 * The height of a binary search tree is the number of edges between the tree's root and its furthest leaf.
 * You are given a pointer, root, pointing to the root of a binary search tree.
 * Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
 *
 * Input Format
 * The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
 * The first line contains an integer, , denoting the number of nodes in the tree.
 * Each of the  subsequent lines contains an integer, , denoting the value of an element that must be added to the BST.
 *
 * Output Format
 * The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.
 *
 **/

class TreeNode{
    TreeNode left,right;

    int data;

    TreeNode(int data){
        this.data=data;
        left=right=null;
    }

}


class BinarySearchTrees{

    public static int getHeight(TreeNode root){
        //Write your code here
        int templeftheight = 0;
        int temprightheight = 0;

        if(root == null){
            return -1;
        }

        if(root.left != null ) {
            templeftheight = 1 + getHeight(root.left);
        }
        if(root.right != null ) {
            temprightheight = 1 + getHeight(root.right);
        }


        return Math.max(templeftheight, temprightheight);


    }

    public static TreeNode insert(TreeNode root,int data){

        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode current;
            if(data<=root.data){
                current = insert(root.left,data);
                root.left = current;
            } else {
                current = insert(root.right,data);
                root.right = current;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;

        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }

        int height=getHeight(root);
        System.out.println(height);
    }
}