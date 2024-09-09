package leetcode.sep;

import java.util.ArrayList;
import java.util.List;

public class Date09th2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode();
        ListNode tmpNode = result;
        int num = 0;
        int value = 0;
        while (head != null) {
            if (head.val == 0) {
                num++;
                if (num == 2) {
                    tmpNode.next = new ListNode(value);
                    tmpNode = tmpNode.next;
                    num--;
                    value = 0;
                }
                head = head.next;
            } else {
                value += head.val;
                head = head.next;
            }
        }
        return result.next;
    }
}

