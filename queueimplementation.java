

public class queueimplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
           this.data=data;
        }
    }

    static public class queue{
        Node front,rear;
        public void enqueue(int data){
            Node newnode=new Node(data);
            if(front == null){
                front=rear=newnode;
            }
            rear.next=newnode;
            rear=newnode;
        }

        public int dequeue(){
            if(front==null){
                return -1;
            }
            int result=front.data;
            front=front.next;
            return result;
        }
        queue(){
            front=rear=null;
        }
    }

    public static void main(String[] args) {
        queue pq=new queue();
        pq.enqueue(8);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.enqueue(4);
        pq.enqueue(5);
        System.out.println(pq.dequeue());
        System.out.println(pq.dequeue());
        System.out.println(pq.dequeue());
        
    }
}
