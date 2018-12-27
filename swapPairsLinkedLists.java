class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode init = new ListNode(0);
        ListNode tmp = init; 
        init.next = head;
        while (tmp.next != null) {
            if (tmp.next.next == null) break;
            ListNode tmp2 = tmp.next;
            tmp.next = tmp2.next;
            tmp2.next = tmp2.next.next;
            tmp.next.next = tmp2;
            tmp = tmp.next.next;
        }
        return init.next;
    }
}