public class reorderLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode reverseL(ListNode head){
        ListNode curr = head;
        ListNode prev = null,next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {

        ListNode t = head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = head;
        ListNode right = reverseL(slow);
        ListNode nextlef=null, nextrig=null;
        while(left!=null && right!=null){
            nextlef=left.next;
            left.next=right;
            nextrig = right.next;
            right.next=nextlef;
            left= nextlef;
            right = nextrig;
        }
    }
}

