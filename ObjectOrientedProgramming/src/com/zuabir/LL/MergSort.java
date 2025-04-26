package com.zuabir.LL;

public class MergSort {
    public ListNode sortList(ListNode head) {
        if( head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left, right);


    }

      public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
           this.val = val;
        }
        ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
        }
      }
    public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head ;
            while(fast!= null && fast.next!= null){
                slow = slow.next ;
                fast = fast.next.next;
            }
            return slow;

        }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to start the merged list
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Append the remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // Return the merged list starting at dummy.next
        return dummy.next;
    }


}
