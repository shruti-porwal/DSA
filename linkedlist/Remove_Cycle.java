package linkedlist;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Remove_Cycle {
    public ListNode Removecycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                ListNode prev = null;
                while(slow != fast){
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
                prev.next = null;
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Remove_Cycle obj = new Remove_Cycle();

        // build: 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(3);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(6);

        // create cycle: node(6) -> node(4)
        head.next.next.next.next = head.next;

        ListNode result = obj.Removecycle(head);

        if (result != null) {
            System.out.println("Cycle removed at node: " + result.val);
        } else {
            System.out.println("No cycle found");
        }

        // print list after cycle removed
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
