public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet();

        ListNode i = head;

        while(i != null)
        {
            if(nodes.contains(i))
            {
                return true;
            }
            else
            {
                nodes.add(i);
            }
            i = i.next;
        }
        return false;
    }
}