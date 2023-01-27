/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.math.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigDecimal num_1 = new BigDecimal(makeNumber(l1));
        BigDecimal num_2 = new BigDecimal(makeNumber(l2));

        StringBuilder sum = new StringBuilder();

        sum.append(num_1.add(num_2));

        String number = sum.toString();

        ListNode result = new ListNode(number.charAt(0) - '0', null);

        int idx = 1;
        
        while(true) {
            if(idx >= number.length()) {
                break;
            }

            result = new ListNode(number.charAt(idx) - '0', result);
            idx++;
        }

        return result;
        
    }

    String makeNumber(ListNode ln) {
        StringBuilder sb = new StringBuilder();

        if(ln.next != null) {
            while(ln.next != null) {
                sb.append(ln.val);
                ln = new ListNode(ln.next.val, ln.next.next);
            }
        }
        sb.append(ln.val);
        return sb.reverse().toString();
    }
}