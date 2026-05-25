package linkedlist;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}
class List{
    Node head;
    Node tail;

    List(){
        head = tail = null;
    }

    void push_front(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    void insert(int pos,int val){
        if(pos<0){
            System.out.println("LL is empty");
            return;
        }
        if(pos == 0){
            push_front(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 0;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    void createCycle(int targetIndex) {
        tail = head;
        while (tail.next != null) {
            tail = tail.next;           // reach last node
        }
        Node target = head;
        for (int i = 0; i < targetIndex; i++) {
            target = target.next;
        }
        tail.next = target;
    }
    Node Detect_Cycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node temp = head;
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
}
public class create_cycle{
    public static void main(String[] args) {
        List l1 = new List();
        l1.insert(0,3);
        l1.insert(1, 4);
        l1.insert(2, 5);
        l1.insert(3,6);
        l1.printLL();
        l1.Detect_Cycle();
        l1.createCycle(1);    
        Node result = l1.Detect_Cycle();
        if (result != null) {
            System.out.println("Cycle starts at node: " + result.data);
        } else {
            System.out.println("No cycle found");
        } 
    }
}// time - O(n) 7 space - O(1)


