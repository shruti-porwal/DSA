package linkedlist;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Copy_Randomlist{
    public Node CopyRandomlist(Node head){
        if(head == null) return null;

        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
}
public static void main(String[] args) {

        // List banao: 1 → 2 → 3
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        // Random pointers set karo
        n1.random = n3;  // 1 → random → 3
        n2.random = n1;  // 2 → random → 1
        n3.random = n2;  // 3 → random → 2

        // Copy banao
        Copy_Randomlist obj = new Copy_Randomlist();
        Node copyHead = obj.CopyRandomlist(n1);

        // Result print karo
        Node temp = copyHead;
        while (temp != null) {
            System.out.print("Node: " + temp.val);
            if (temp.random != null)
                System.out.print(" | random: " + temp.random.val);
            else
                System.out.print(" | random: null");
            System.out.println();
            temp = temp.next;
        }

        // Verify: copy aur original alag hain
        System.out.println("\nOriginal aur Copy alag hain: " + (n1 != copyHead));
    }
}