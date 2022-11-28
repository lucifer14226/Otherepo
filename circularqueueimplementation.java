public class circularqueueimplementation {
    static class Circularqueue{
        int a[];
        int n;
        int front=-1;
        int rear=-1;

        Circularqueue(int n){
            this.n=n;
            a=new int[n];
        }
        void enqueue(int data){
            if((rear+1)%n==front){
                return;
            }
            if(front==-1)front=0;
            rear=(rear+1)%n;
            a[rear]=data;
        }
        int dequeue(){
            if(front==-1){
                return -1;
            }
            if(front==rear){
                front=rear=-1;
            }
            int result=a[front];
            front=(front+1)%n;
            return result;
        }
    }

    public static void main(String[] args) {
        Circularqueue rs=new Circularqueue(5);
        rs.enqueue(8);
        rs.enqueue(7);
        rs.enqueue(6);
        rs.enqueue(5);
        rs.enqueue(4);
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        rs.enqueue(3);
        rs.enqueue(2);
        rs.enqueue(1);
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
        System.out.println(rs.dequeue());
    }
}
