package Leetcode_practice.Collections;

public class singlyLinkedList {
    public class Node{
        Node next ;
        int val;

        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = null;
        }
        Node(){}
    }

    private Node head;

    public void insertinbeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertatend(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode = head;
        }
        Node temp = head;

        while(temp.next!=null){
            temp.next = newNode;
            newNode.next = null;
        }
    }

    public void insertatposition(int pos, int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode = head;
            return;
        }
        int count = 0;
        Node temp = head;
        while(temp.next != null && count <= pos -1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
