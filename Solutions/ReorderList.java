class reorderList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode i = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(i != null)
        {
            ListNode temp = i.next;
            i.next = prev;
            prev = i;
            i = temp;
        }

        ListNode j = prev;
        i = head;

        while(j != null)
        {
            ListNode tempI = i.next;
            ListNode tempJ = j.next;
            i.next = j;
            j.next = tempI;
            j = tempJ;
            i = tempI;
        }
    }
}