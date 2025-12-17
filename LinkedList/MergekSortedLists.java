package LinkedList;

// logic ye hai ki hum divide and conquer approach use karenge
// hum linked lists ko pairs me divide karenge aur unhe merge karenge
// jab tak humare paas sirf ek list na bache
// merge karne ke liye hum ek helper function banayenge jo do sorted linked lists ko merge karega
// aur ek sorted linked list return karega
// is tarah se hum sare k linked lists ko merge kar denge
// final merged sorted linked list milega



public class MergekSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // is function me horha hai k linked lists ko merge karna
    // ku ch edge cases handle karne ke liye
    // agar lists null hai ya length 0 hai to null return kar dena hai


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }


    // is function me horha hai k linked lists ko divide and conquer karna
    // left aur right indices ke beech me
    // agar left aur right same hai to wahi list return kar dena hai
    // mid calculate karna hai aur fir left aur right halves ko recursively merge karna hai
    // finally dono merged halves ko merge kar dena hai



    private ListNode mergeKListsHelper(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode l1 = mergeKListsHelper(lists, left, mid);
        ListNode l2 = mergeKListsHelper(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }
       /// is function me horha hai k do sorted linked lists ko merge karna
       // aur ek sorted linked list return karna
       // agar kisi bhi list me null hai to dusri list return kar dena hai
       // dono lists ke head nodes ko compare karna hai
       // chhoti value wale node ko result me add karna hai




     

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
