class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldNew = new HashMap();

        Node i = head;
        while(i != null)
        {
            oldNew.put(i, new Node(i.val));
            i = i.next;
        }

        i = head;
        Node newHead = oldNew.get(i);

        while(i != null)
        {
            Node newNode = oldNew.get(i);
            newNode.next = oldNew.get(i.next);
            newNode.random = oldNew.get(i.random);
            i = i.next;
        }
        return newHead;
    }
}