package leetCode;

public class Algorithms2ReverseLinkedList {
    public static void main(String[] args) {


    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    //using recursion 1:
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode nextNode = head.next;
            head.next = null;
            ListNode rest = reverseList((nextNode));
            nextNode.next = head;
            return rest;
        }
    }

    //using recursion 2:
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nextNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return nextNode;
    }
}