import java.util.*;

public class stack_implementing_Queue {

    public static class Stack{
        private Queue<Integer>q1;
        private Queue<Integer>q2;
        //private int top;
        Stack(){
            q1=new ArrayDeque<>();
            q2=new ArrayDeque<>();
        }
        public void push(int x){
           if(q1.isEmpty()){
            q1.add(x);
           }
           else{
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer>temp=q1;
            q1=q2;
            q2=temp;
           }
        }
        public int pop(){
            return q1.remove();
        }
        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(23);
        s1.push(46);
        s1.push(45);
        s1.push(90);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.isEmpty());
    }
}
