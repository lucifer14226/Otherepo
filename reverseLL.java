
public class reverseLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node reversal(Node head){
      Node curr=head;
      Node prev=null;
      while(curr!=null){
        Node temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
      }
      return prev;
    }
    public static void main(String[] args) {
        
    }
}
