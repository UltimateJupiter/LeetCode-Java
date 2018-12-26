class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode init = new ListNode(0);
        ListNode tmp = init;
        tmp.next = head;
        init.next = head;
        int total = 0;
        while (tmp.next != null){
            total++;
            tmp = tmp.next;
        }
        tmp = init;
        for (int i = 0; i < total - n; i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return init.next;
    }
}