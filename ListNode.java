package Leetcode_practice;

public class ListNode {
    public int value;
    public ListNode next;
    ListNode(){};
    ListNode(int value){this.value = value;};
    ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}