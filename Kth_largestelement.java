import java.util.*;

public class Kth_largestelement {

    static int largest_element(int A[],int k){
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       for(int i=0;i<k;i++){
          pq.add(A[i]);
       }
       for (int i = k; i < A.length; i++) {
         if(pq.peek()<A[i]){
            pq.poll();
            pq.add(A[i]);
         }
       }
       return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] A=new int[b];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println(largest_element(A,3));
        sc.close();
    }
}
