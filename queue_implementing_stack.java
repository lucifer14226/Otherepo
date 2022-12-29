import java.util.*;

public class queue_implementing_stack {
    public static class Queue{
        private Stack<Integer>s1;
        private Stack<Integer>s2;
        Queue(){
            s1=new Stack<>();
            s2=new Stack<>();
        }
        public void add(int x){
            s1.push(x);
        }
        public int remove(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int top=s2.pop();
            Stack<Integer>temp=s1;
            s1=s2;
            s2=temp;
            return top;
        }
        public boolean isEmpty(){
            return s1.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.add(23);
        q1.add(46);
        q1.add(45);
        q1.add(90);
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.isEmpty());
    }
}
