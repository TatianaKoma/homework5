package leetCode;

public class T11RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode())))));
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

    //function to count number of nodes
    public static int count(ListNode head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //base condition
        if (n == 0) {
            return head;
        }
        int a = count(head);
        int ans = a - n;

        //meaning if ans is 0,it means we have to remove the head pointed node,that is first element
        if (ans == 0) {
            head = head.next;
            return head;
        }

        //else
        ListNode temp = head;
        int i = 0;

        //ascending the temp pointer just before the node which has to be deleted
        while (i < ans - 1) {
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}
