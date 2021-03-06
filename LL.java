public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int value){
         Node node = new Node(value);
         node.next=head;
         head=node;

         if(tail == null){
             tail = head;
         }
         size =+1;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        tail=node;

        size=+1;

    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
