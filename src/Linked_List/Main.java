package Linked_List;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(34);
        System.out.println(node1.data + " " + node1.next);

        Node node2 = new Node(36);
        System.out.println(node2.data + " " + node2.next);

        //linking node 1 next node into node2
        node1.next = node2;
        System.out.println(node1.data + " " + node1.next.data);

        //linking node 2 next node into node 1 data
        node2.next = node1;
        System.out.println(node2.data + " " + node2.next.data);
    }
}
