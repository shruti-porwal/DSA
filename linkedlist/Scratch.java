package linkedlist;
// Implementation from scratch 
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
        Node newNode = new Node(val);// dynamic which stores in memory after execution 
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    void insert(int val,int pos){
        if(pos<0){
            System.out.println("invalid position");
            return;
        }
        if(pos == 0){
            push_front(val);
            return;
        }
        Node temp = head;
        for(int i = 0;i<pos-1;i++){
            temp = temp.next;
        }
        Node newNode = new Node(val);
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

public class Scratch{
    public static void main(String[] args){
        List l1 = new List();
        l1.push_front(3);
        l1.push_front(2);
        l1.push_front(1);
        l1.insert(4,1);
        l1.printLL();
    }
}