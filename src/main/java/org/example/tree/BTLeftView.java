package org.example.tree;


import java.util.*;

public class BTLeftView {

    static Scanner sc=null;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        TreeNodeLV root = createTree();

        //inOrder(root);

        //printTopView(root);

        //printBottomView(root);

        //printLeftView(root);

        printRightView(root);

    }


    static void printRightView(TreeNodeLV root){
        if(root==null) return;

        Map<Integer,Integer> m1 = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while (!q.isEmpty()){
            Pair frontNode = q.poll();

            m1.put(frontNode.level, frontNode.node.data);

            if(frontNode.node.left != null){
                q.add(new Pair(frontNode.node.left,frontNode.level+1));
            }
            if(frontNode.node.right != null){
                q.add(new Pair(frontNode.node.right,frontNode.level+1));
            }
        }
        System.out.println(m1);
    }


    static void printLeftView(TreeNodeLV root){
        if(root==null) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        Map<Integer,Integer> m1 = new HashMap<>();

        while (!q.isEmpty()){
            Pair frontNode = q.poll();


            if(m1.get(frontNode.level)==null) {
                m1.put(frontNode.level, frontNode.node.data);
            }

            int currNodeData=frontNode.node.data;
            int level=frontNode.level;

            if(frontNode.node.left != null){
                q.add(new Pair(frontNode.node.left,frontNode.level+1));
            }

            if(frontNode.node.right != null){
                q.add(new Pair(frontNode.node.right,frontNode.level+1));
            }

        }

        System.out.println(m1);

    }


    static void printBottomView(TreeNodeLV root){
        if(root==null) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        Map<Integer,Integer> m1 = new HashMap<>();

        while (!q.isEmpty()){
            Pair frontNode = q.poll();

            //bottom view main logic
            m1.put(frontNode.level,frontNode.node.data);

            int currNodeData=frontNode.node.data;
            int level=frontNode.level;

            if(frontNode.node.left != null){
                q.add(new Pair(frontNode.node.left,frontNode.level-1));
            }

            if(frontNode.node.right != null){
                q.add(new Pair(frontNode.node.right,frontNode.level+1));
            }

        }

        System.out.println(m1);

    }

    static void printTopView(TreeNodeLV root){
        if(root==null) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        Map<Integer,Integer> m1 = new HashMap<>();

        while (!q.isEmpty()){
            Pair frontNode = q.poll();

            if(m1.get(frontNode.level)==null){
                m1.put(frontNode.level,frontNode.node.data);
            }

            int currNodeData=frontNode.node.data;
            int level=frontNode.level;

            if(frontNode.node.left != null){
                q.add(new Pair(frontNode.node.left,frontNode.level-1));
            }

            if(frontNode.node.right != null){
                q.add(new Pair(frontNode.node.right,frontNode.level+1));
            }

        }

        System.out.println(m1);

    }

    static void inOrder(TreeNodeLV root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static TreeNodeLV createTree(){
        TreeNodeLV root=null;

        System.out.print("Node value - ");
        int data= sc.nextInt();
        if(data == -1) return null;

        root = new TreeNodeLV(data);

        System.out.println("left of "+data);
        root.left=createTree();

        System.out.println("right of "+data);
        root.right=createTree();

        return root;
    }

}

class Pair{

    TreeNodeLV node;
    int level;

    public Pair(TreeNodeLV node,int level){
        this.node =node;
        this.level=level;
    }

}

class TreeNodeLV{
    TreeNodeLV left;
    TreeNodeLV right;
    int data;

    public TreeNodeLV(int data){
        this.data=data;
    }
}
