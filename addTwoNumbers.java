/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        int value;
        int v1l = 0, v2l = 0;
        ListNode ret = null;
        ListNode tmpln = null;
        while (l1 != null || l2 != null || tmp == 1){
            
            if (l1 == null){
                v1l = 0;
            }
            else {
                v1l = l1.val;
                l1 = l1.next;
            }

            if (l2 == null){
                v2l = 0;
            }
            else {
                v2l = l2.val;
                l2 = l2.next;
            }

            value = (v1l + v2l + tmp) % 10;
            if (ret == null) {
                ret = new ListNode(value);
                tmpln = ret;
            }
            else {
                tmpln.next = new ListNode(value);
                tmpln = tmpln.next;
            }
            
            tmp = (v1l + v2l + tmp) / 10;
        }
        return ret;
    }
}