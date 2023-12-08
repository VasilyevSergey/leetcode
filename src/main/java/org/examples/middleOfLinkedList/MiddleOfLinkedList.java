package org.examples.middleOfLinkedList;

public class MiddleOfLinkedList {
    /**
     * Given the head of a singly linked list, return the middle node of the linked list.
     * If there are two middle nodes, return the second middle node.<p>
     * The number of nodes in the list is in the range [1, 100].<p>
     * 1 <= Node.val <= 100
     */

    public static ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        ListNode currentNode = head;
        int size = 1;

        while (currentNode.next != null) {
            size++;
            if (size % 2 == 0) {
                middleNode = middleNode.next;
            }
            currentNode = currentNode.next;
        }
        return middleNode;
    }
}
