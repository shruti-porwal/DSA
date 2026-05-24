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
    Node Mid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class Middle{
    public static void main(String[] args) {
        List l1 = new List();
        l1.insert(0,3);
        l1.insert(1, 4);
        l1.insert(2, 5);
        l1.insert(3,6);
        l1.printLL();
        Node mid = l1.Mid();// store krwao 
        System.out.println(mid.data);

    }
}
