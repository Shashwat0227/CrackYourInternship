import java.util.*;
public class BinaryListToInt {
    public class ListNode {
      int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public int BinaryListTodec(ListNode head){
     ListNode curr = head;
     StringBuilder str = new StringBuilder("");
     while (curr != null){
      str.append(curr.val);
      curr = curr.next;


     }
 int dec = Integer.parseInt(str.toString(),2);
     return dec;

    }

}
