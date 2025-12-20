package LinkedList;

public class Removefromfirst {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode removeFromFirst(ListNode head) {
         //  ya logic hai ki head ko next me shift kar dena hai
         // aur agar head null hai to null return kar dena hai
         // agar head null hai to null return kar dena hai

        if(head == null){
            return null;
        }

     return head.next;
    }
    public static void main(String[] args) {
        System.out.println("Remove from first - Placeholder");
        Removefromfirst solution = new Removefromfirst();
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        System.out.println("Original List:");
        
        ListNode current = head;
         ///  why you use the while loop here  
         /// because you want to print all the elements of the linked list

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }       
        head = solution.removeFromFirst(head);
        System.out.println("\nList after removing first element:");
        current = head;
        while (current != null) {   
            System.out.print(current.val + " ");
            current = current.next;
        }           


    }
}
