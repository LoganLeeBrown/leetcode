class removeNthFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode i = head;
        int count = 0;

        while(i != null)
        {
            count++;
            i = i.next;
        }

        if(n == count)
        {
            return head.next;
        }

        ListNode j = new ListNode();
        j.next = head;
        while(count != n)
        {
            j = j.next;
            count--;
        }

        System.out.println(j.val);

        j.next = j.next.next;

        return head;
    }
}