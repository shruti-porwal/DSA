package linkedlist;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Merge_Sorted {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next , list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1 , list2.next);
            return list2;
    }
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
