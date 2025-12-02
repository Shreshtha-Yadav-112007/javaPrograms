public class LLPrac {
    Node head;
    private int size;
    LLPrac (){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;
    }
    public void printLinkedList(){
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+" ");
        currNode=currNode.next;
        }
        System.out.println("NULL");
        return;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The linked list is empty.");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        size--;
        head=head.next;
        return;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The Linked List is empty.");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next!=null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
        return;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LLPrac LinkedList = new LLPrac();
        LinkedList.addFirst("Hi!");
        LinkedList.addFirst("Yo!");
        LinkedList.addLast("Wassup!");
        LinkedList.addLast("Voila!");
        LinkedList.deleteFirst();
        LinkedList.deleteLast();
        System.out.println(LinkedList.getSize());
        LinkedList.printLinkedList();
    }
}