package LinkedList;
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};
public class Intialization{
    public static void main(String[] args) {
        Node x = new Node(2);
        Node y = new Node(5);
        Node z = new Node(10);

        x.next = y;
        y.next = z;
        System.out.println(x.data);
        System.out.println(x.next);
        System.out.println(x.next.data);
    }
}