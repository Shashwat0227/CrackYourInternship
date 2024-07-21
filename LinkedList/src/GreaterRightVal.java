public class GreaterRightVal {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    class Solution
    {
        Node compute(Node head)
        {
            // your code here
            if(head.next == null) return head;

            Node curr = compute(head.next);
            if(head.data>=curr.data){
                head.next = curr;
                return head;
            }
            return curr;

        }
    }

}
