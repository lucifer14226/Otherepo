public class queuecircular {

    static class Queue{
        int a[];
        int capacity;
        int rear;
        Queue(int n){
            capacity=n;
            a=new int[n];
            rear=-1;
        }
        void enqueue(int data){
            if(rear==capacity-1){
                return;
            }
            rear++;
            a[rear]=data;
        }
        int dequeue(){
            if(rear==-1){
                return -1;
            }
            int result=a[0];
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            return result;
        }
        int getfront(){
            if(rear==-1){
                return -1;
            }
            return a[0];
        }
    }
    public static void main(String[] args) {
        
    }
}
