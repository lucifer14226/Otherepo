import java.util.*;


public class Median {
    
    PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minheap=new PriorityQueue<>();

    public void InsertNum(int a){
       if(maxheap.isEmpty() || maxheap.peek()>a){
           maxheap.add(a);
       }
       else if(maxheap.peek()<a){
        minheap.add(a);
       }

       if(maxheap.size() > minheap.size()+1){
         minheap.add(maxheap.poll());
       }
       else if(maxheap.size()<minheap.size()){
        maxheap.add(minheap.poll());
       }
    }

    public double FindMedian(){
        if(maxheap.size()==minheap.size()){
            return (minheap.peek()+maxheap.peek())/2;
        }
        return maxheap.peek();
    }
    
    
    public static void main(String[] args) {    
        
    }
}
