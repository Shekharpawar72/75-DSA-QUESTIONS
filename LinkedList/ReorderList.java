package LinkedList;

public class ReorderList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public void reorderList(ListNode head) {
        // find the middle of the list
           ListNode slow =  head,  fast = head;

           while(fast != null && fast.next != null){
                 slow = slow.next;
                 fast= fast.next.next;
           }

        // revesre the secound haslf

       
            ListNode secoundH = slow.next;
            slow.next= null;
            ListNode node = null;

            while(secoundH != null){
                ListNode temp = secoundH.next;
                secoundH.next = node;
                node = secoundH;
                secoundH = temp;
            }

        /// step 3: for mergoing the both list 
        ListNode first = head;
        secoundH= node;

        while( secoundH!= null){
             ListNode temp1= first.next , temp2 = secoundH.next;
             first.next = secoundH;
             secoundH.next= temp1;
             first= temp1;
             secoundH= temp2;

        }
    }
    public static void main(String[] args) {
        ReorderList list = new ReorderList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        list.reorderList(head);
        System.out.println("\nReordered List:");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
