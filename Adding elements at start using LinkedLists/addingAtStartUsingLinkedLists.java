public class addingAtStartUsingLinkedLists {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("LinkedLIst is empty.");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.print("Null");
        return;
    }
    public static void main(String[] args) {
        addingAtStartUsingLinkedLists LinkedList = new addingAtStartUsingLinkedLists();
        LinkedList.addFirst("Shreshtha!");
        LinkedList.addFirst("Hi");
        LinkedList.printLinkedList();
    }
}
