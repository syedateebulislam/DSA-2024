package org.example.dsa.LinkedList;


public class ReverseLinkList {

    public static void main(String[] args) {

        LinkList head = new LinkList(10);

        LinkList node2 = new LinkList(20);
        head.next=node2;

        LinkList node3 = new LinkList(30);
        node2.next=node3;

        printList(head);

        LinkList rev = reverse(head);

        printList(rev);
    }

    static LinkList reverse(LinkList head){

        LinkList currNode=head;

        //initialize prev node as null so that last node of rev list can have null value
        LinkList prevNode=null;

        while (currNode!=null){
            LinkList nextNode=currNode.next;
            currNode.next=prevNode;//curr node address is getting assigned to prev node
            prevNode=currNode;//prev node is shifting to curr node completely
            currNode=nextNode;//curr node is shifting to next node completely
        }

        head=prevNode;

        return head;
    }

    static void printList(LinkList head){
        System.out.println("\n");
        while (head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("null");
    }
}



class LinkList{
    int data;
    LinkList next;

    public LinkList(int data){
        this.data=data;
        this.next=null;
    }
}