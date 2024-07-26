package LeetCode;

public class AddTwoNumbers {
    /*
    Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
     */
    public static void main(String[] args) {
//    String name="";

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode ptr = result;
        int carry = 0;
        while (l1 == null || l2 == null) {
            int sum = 0 + carry;
            if (l1 != null) {
                sum += l1.val;
                ptr = ptr.next;
            }
            if (l2 != null) {
                sum += l2.val;
                ptr = ptr.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new ListNode();
            ptr = ptr.next;
        }
        if (carry == 1) ptr.next = new ListNode();
        return result.next;
    }

}
