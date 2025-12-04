public class addingAtLastUsingLinkedLists {
    public int size;
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
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
        currNode.next = newNode;
        return;
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("LinkedList is empty.");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        return;
    }
    public static void main(String[] args) {
        addingAtLastUsingLinkedLists LinkedList = new addingAtLastUsingLinkedLists();
        LinkedList.addLast("Hi");
        LinkedList.addLast("Shreshtha!");
        LinkedList.printLinkedList();
    }
}
