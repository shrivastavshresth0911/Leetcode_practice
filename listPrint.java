import Leetcode_practice.ListNode;

public class listPrint {
    public static void printList(ListNode node){
        while(node != null){
            System.out.print(node.value);
            if(node.next != null)
                System.out.print("->");
           node = node.next;
        }
        System.out.println();
    }
}