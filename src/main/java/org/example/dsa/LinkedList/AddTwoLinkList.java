package org.example.dsa.LinkedList;

public class AddTwoLinkList {
    public static void main(String[] args) {

        LinkListOne list1head = new LinkListOne(1);

        LinkListOne list1node2 = new LinkListOne(2);
        list1head.next=list1node2;

        LinkListOne list1node3 = new LinkListOne(3);
        list1node2.next=list1node2;

        //-----------

        LinkListOne list2head = new LinkListOne(1);

        LinkListOne list2node2 = new LinkListOne(2);
        list2head.next=list2node2;

        LinkListOne list2node3 = new LinkListOne(3);
        list2node2.next=list2node2;


    }

    public static LinkListOne addNum(LinkListOne list1, LinkListOne list2){

        while (list1!=null){
            int n = list1.data+list2.data;
            list1=list1.next;
        }

        return null;
    }
}


class LinkListOne{
    int data;
    LinkListOne next;

    public LinkListOne(int data){
        this.data=data;
        this.next=null;
    }
}
