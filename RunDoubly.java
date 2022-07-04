public class RunDoubly {
    public static void main(String[] args) {
       DoublyLL list = new DoublyLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        list.insertIndex(6,4);
        System.out.println();
        list.display();
        System.out.println();
    }
}
