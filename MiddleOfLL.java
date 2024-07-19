public class MiddleOfLL {
    class ListNode {
      int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }}
//
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null) return head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

