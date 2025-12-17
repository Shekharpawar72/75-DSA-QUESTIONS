package LinkedList;

public class MergekSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }
    private ListNode mergeKListsHelper(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode l1 = mergeKListsHelper(lists, left, mid);
        ListNode l2 = mergeKListsHelper(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null){
             return l2;
        }
        if(l2== null){
             return l1;
        }
        if(l1.val<l2.val){
          l1.next= mergeTwoLists(l1.next, l2);
          return l1;
        }else{ 
            l2.next=  mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        MergekSortedLists solution = new MergekSortedLists();

        // Creating sample linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{list1, list2, list3};

        // Merging k sorted linked lists
        ListNode mergedHead = solution.mergeKLists(lists);

        // Printing the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
