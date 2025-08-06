// intersection of two linked lists

public class intersection{

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }
    public static Node intersections(Node head1 , Node head2){
        // to traverse ll1 
        Node temp = head1 ;
        // to traverse ll2 
        Node current = head2 ;
        // sizes of both ll
        int size1 = 0 ;
        int size2 = 0 ;
        while(temp != null){
            size1 ++ ;
            temp = temp.next ;
        }
        while(current != null){
            size2 ++ ;
            current = current.next ;
        }
         temp = head1 ;
        current = head2 ;
        // Case1 : if ll1 is greater
        if(size1 > size2){
            int steps = size1 - size2 ;
            for(int i = 1 ; i <= steps ; i++){
                temp = temp.next ;
            }
        }
        // Case 2 : if ll2 is greater
        else{
        int steps = size2 - size1 ;
        for(int i = 1 ; i <= steps ; i++){
            current = current.next ;
        }
        }
        // traversing both ll until we get intersection node
        while(temp != current){
          temp = temp.next ;
          current = current.next ;
        }
        return temp ;
    }
   public static void main(String[] args){
    // linked list 1
    Node head1 = new Node(1);
    Node a = new Node(3);
    Node b = new Node(1);
    Node c = new Node(2);
    Node d  = new Node(4);
    head1.next = a ;
    a.next = b ;
    b.next = c ;
    c.next = d ;
    // linked list 2
    Node head2 = new Node(3);
    Node e = new Node(2);
    Node f = new Node(4);
    head2.next = e ;
    e.next = f ;
    // intersection
    Node ans = intersections(head1, head2);
    System.out.println(ans.data);
    
}}