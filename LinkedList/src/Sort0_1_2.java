public class Sort0_1_2 {
    Node head;


    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void sortList()
    {

        int count[] = {0, 0, 0};

        Node ptr = head;


        while (ptr != null)
        {
            count[ptr.data]++;
            ptr = ptr.next;
        }

        int i = 0;
        ptr = head;


        while (ptr != null)
        {
            if (count[i] == 0)
                i++;
            else
            {
                ptr.data= i;
                --count[i];
                ptr = ptr.next;
            }
        }
    }


    public void push(int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.next = head;


        head = new_node;
    }

}
