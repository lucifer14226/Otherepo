

public class LL {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
           this.data = data;
        }
    }

    static void traverse(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    
    static void insert(int data ,Node head,int k){
       Node toadd=new Node(data);
       if(k==0){
        toadd.next=head;
        head=toadd;
       }
       Node prev=head;
       for(int i=0;i<k-1;i++){
        prev=prev.next;
       }
       toadd.next=prev.next;
       prev.next=toadd;
    }

    static void delete(Node head,int k){
        if(k==0){
            head=head.next;
        }
        Node prev=head;
        for(int i=0;i<k-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next; 
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
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
        insert(40, head, 3);
        insert(50, head, 4);
        insert(60, head, 5);
        insert(70, head, 6);
        traverse(head);
        System.out.println();
        Node start=reversal(head);
        traverse(start);
    }
}
