import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        List<ListNode> list = new ArrayList<>(Arrays.asList(lists));
        while (list.size() > 1) {
            System.out.println();
            List<ListNode> tmp = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i += 2){
                tmp.add(mergeTwoLists(list.get(i), list.get(i + 1)));
            }
            if (list.size() % 2 == 1) tmp.add(list.get(list.size() - 1));
            list = tmp;
        }
        return list.get(0);
    }
}