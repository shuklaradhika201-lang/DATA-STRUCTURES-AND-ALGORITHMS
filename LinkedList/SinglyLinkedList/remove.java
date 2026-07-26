package LinkedList.SinglyLinkedList;

public class remove {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {

        // Remove val from beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Before:");
        printList(head);

        head = removeElements(head, 6);

        System.out.println("After:");
        printList(head);
    }
}