package org.example.tree;

import java.util.Scanner;

public class BinaryTreeCreation {

    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        TreeNode node = createTree();

        System.out.println("--");
        inOrder(node);
        System.out.println("\n--");
        preOrder(node);
        System.out.println("\n--");
        postOrder(node);

    }

    static void inOrder(TreeNode root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    static void preOrder(TreeNode root){
        if(root==null) return;

        System.out.print(root.data);
        inOrder(root.left);
        inOrder(root.right);
    }

    static void postOrder(TreeNode root){
        if(root==null) return;

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data);

    }

    static TreeNode createTree(){
        TreeNode root=null;
        System.out.println("Enter Node data -");
        int data = scanner.nextInt();

        if(data==-1){
            return null;
        }

        root = new TreeNode(data);

        System.out.println("Enter left node data for "+data);
        root.left=createTree();

        System.out.println("Enter right node data for "+data);
        root.right=createTree();

        return root;
    }


}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int data;
    public TreeNode(int data){
        this.data=data;
    }
}
