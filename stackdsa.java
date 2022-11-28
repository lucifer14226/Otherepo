public class stackdsa {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static class StackArray{
       int top;
       int a[];
       int capacity;
       public StackArray(int capacity){
          top=-1;
          this.capacity=capacity;
          a=new int[capacity];
       }

       void push(int data){
         if(capacity-1==top){
            return;
          }
          top++;
          a[top]=data;
        }
        int peek(){
           if(top==-1){
            return 0;
           }
           return a[top];
        }
        int pop(){
            if(top==-1){
                return 0;
            }
            int res=a[top];
            top--;
            return res;
        }

        boolean isEmpty(){
            return top==-1;
        }
    }

    static class StackNode{
        Node head;
        int size;

        public StackNode(){
            head=null;
            size=0;
        }

        void push(int data){
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(size==0){
                return 0;
            }
            int res=head.data;
            head=head.next;size--;
            return res;
            
        }

        int peek(){
            if(head==null){
                return 0;
            }
            return head.data;
        }

        boolean isEmpty(){
            return head==null;
        }
        int size(){
           return size;
        }
    }

    public static void main(String[] args) {
        // StackArray s=new StackArray(4);
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // s.push(40);
        // System.out.println(s.peek());
        // s.pop();
        // System.out.println(s.peek());
        // s.pop();
        // s.pop();
        // s.pop();
        // System.out.println(s.isEmpty());

        StackNode s=new StackNode();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
        System.out.println(s.size());
        s.pop();
        System.out.println(s.peek());
    }

   
}
