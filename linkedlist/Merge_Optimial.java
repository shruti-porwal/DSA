package linkedlist;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Merge_Optimial {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);   // declare with ListNode ✅
        ListNode current = dummy;           // declare with ListNode ✅

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;       // use WITHOUT ListNode ✅
                list1 = list1.next;
            } else {
                current.next = list2;       // use WITHOUT ListNode ✅
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;
    }
public static void main(String[] args) {
        Merge_Sorted obj = new Merge_Sorted();

        // L1 = 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // L2 = 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // merge
        ListNode result = obj.mergeTwoLists(l1, l2);

        // print result
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");
    }
}
// iterative approach where memory become O(1) but time complexity remains same like recursive approach O(n+m)

