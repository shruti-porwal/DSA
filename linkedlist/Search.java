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
    int search(int key){
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    void insert(int val){
         Node newNode = new Node(val);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
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
public class Search {
    public static void main(String[] args) {
        List l1 = new List();
        l1.insert( 3);
        l1.insert(1);
        l1.insert(2);
        l1.search(1);
        l1.printLL();
        System.out.println(l1.search(1));
    }
}
