package org.example.LinkedList;

import java.util.HashSet;
import java.util.Set;

class Node{

    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

public class DetectCycleLinkedList {

    public static void main(String[] args) {

        Node headNode = new Node(30);

        Node secondNode = new Node(40);
        headNode.next= secondNode;

        Node thirdNode = new Node(50);
        secondNode.next= thirdNode;

//        thirdNode.next=secondNode;

        while(headNode!=null){
            System.out.println(headNode.data);
            headNode=headNode.next;
        }

        //System.out.println(LinkedList.detectCycle(headNode));
    }

    public static boolean detectCycle(Node head){
        Set<Node> set = new HashSet<>();

        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }
}

