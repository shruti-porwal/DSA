package linkedlist;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
};

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
    void push_back(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insert(int pos,int val){
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
}
public class Operation{
    public static void main(String[] args) {
        List l1 = new List();
        l1.push_front(3);
        l1.push_front(2);
        l1.push_front(1);
        l1.push_back(0);
        l1.insert(1,7);
        l1.printLL();
    }
}
