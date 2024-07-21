public class RemoveDuplicates {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }}
//

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode curr =head;
        ListNode temp =head.next;
        ListNode ans = new ListNode(0);
        ListNode res = ans;
        while ( temp!=null   ){
            if(curr.val != temp.val){
                ans.next = new ListNode(curr.val);
                ans = ans.next;
            }
            curr = curr.next;
            temp = temp.next;

        }
        ans.next = curr;
        return res.next;
    }
}
