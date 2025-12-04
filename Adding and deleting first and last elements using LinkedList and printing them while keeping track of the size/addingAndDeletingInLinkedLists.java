public class addingAndDeletingInLinkedLists {
    public int size;
    addingAndDeletingInLinkedLists(){
        this.size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
        return;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void deleteFirst(){
        if(head==null){
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
        return;
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("LinkedList is empty.");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        return;
    }
    public void deleteLast(){
        if(head==null){
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
        addingAndDeletingInLinkedLists LinkedList = new addingAndDeletingInLinkedLists();
        LinkedList.addFirst("Shreshtha!");
        LinkedList.addFirst("Hi");
        LinkedList.addLast("LOL");
        LinkedList.deleteFirst();
        LinkedList.deleteLast();
        LinkedList.printLinkedList();
        System.out.println(LinkedList.getSize());
    }
}
