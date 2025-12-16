package LinkedList;

public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
     
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
           if(list1 == null){
             return list2;
           }
           if(list2 == null){
             return list1;
           }
               
        // logic ky hai ki jo chota hoga uske next me baaki dono list ko dal dena hai

           if(list1.val<list2.val){
             list1.next = mergeTwoLists(list1.next, list2); // isme recursion ho rhi hai
             return list1;
           }else{
            list2.next = mergeTwoLists(list2.next, list1); //  isme recursion ho rhi hai
            return list2;
           }

    }
    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Creating first sorted linked list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating second sorted linked list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merging the two sorted linked lists
        ListNode mergedHead = solution.mergeTwoLists(list1, list2);

        // Printing the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
