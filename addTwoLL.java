// Code for : Addition of two linked list
public class AddTwoLL {
    public static class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
        }
    }
   public  static Node addTwoLinkedList(Node head1 , Node head2){
    // used to traverse ll1
    Node temp1 = head1 ;
    // used to traverse ll2 
    Node temp2 = head2 ;
    // creating a dummy node
    Node dummyNode = new Node(-1);
    // current is used to traverse dummy Node
    Node current = dummyNode ;
    int carry = 0 ;
    while(temp1 != null || temp2 != null || carry == 1){
        int sum = carry ;
        if(temp1 != null){
            sum += temp1.data ;
            temp1 = temp1.next ;
        }
        if(temp2 != null){
            sum += temp2.data ;
            temp2 = temp2.next ;
        }
    // creating new nodes for resultant linked list
     Node newNode = new Node(sum % 10);
     carry = sum/10 ;
     // connecting dummy node to resultant ll
     current.next = newNode ;
     current = newNode ;
    }
    return dummyNode.next ;
   }
   // method to display addition of two linked list
   public static Node displayLL(Node head){
    Node temp = head ;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next ;
    }
   }
    public static void main(String[] args) {
        // linked list 1 
        Node head1 = new Node(2);
        Node a = new Node(4);
        Node b = new Node(6);

        head1.next = a ;
        a.next = b ;
        b.next = null ;

        // linked list 2
        Node head2 = new Node(3);
        Node c = new Node(8);
        Node d = new Node(7);

        head2.next = c ;
        c.next = d ;
        d.next = null ;

        // resultant ll
        Node head = addTwoLinkedList(head1, head2);
        displayLL(head);

    }
}
