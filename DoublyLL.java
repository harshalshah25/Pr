public class DoublyLL {
    private Node Head;
    private Node Tail;
    private int size=0;
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        Node(int val){
            this.val=val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = Head;
        node.prev = null;
        if(Head != null){
            Head.prev = node;
        }
        Head = node;

        if(Tail == null) {
            Tail = Head;
        }
        size =+1;
    }

    public void display(){
        Node temp = Head;

        while(temp != null){
            System.out.print(temp.val+" <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void ReverseDisplay(){
        Node temp = Tail;

        while(temp != null){
            System.out.print(temp.val+" <-> ");
            temp = temp.prev;
        }
        System.out.print("null");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = Head;
        Node last = null;

        if(Head == null){
            Head = node;
            return;
        }
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
        Tail = node;

    }

    public void insertIndex(int val,int after){
        Node node = new Node(val);
        Node p = Head;
        for(int i =1; i<=after; i++){
            p = p.next;
        }
        node.next = p.next;
        p.next = node;
        node.prev =p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

}
