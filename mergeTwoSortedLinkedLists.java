class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode init = new ListNode(0);
        ListNode tmp = init;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val){
                tmp.next = new ListNode(l1.val);
                l1 = l1.next;
                tmp = tmp.next;
            }
            else {
                tmp.next = new ListNode(l2.val);
                l2 = l2.next;
                tmp = tmp.next;
            }
        }
        if (l1 == null) tmp.next = l2;
        else tmp.next = l1;
        return init.next;
    }
}