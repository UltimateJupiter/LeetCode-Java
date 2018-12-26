class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode init = new ListNode(0);
        ListNode fast = init;
        ListNode slow = init;
        fast.next = head; slow.next = head; init.next = head;
        for (int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return init.next;
    }
}