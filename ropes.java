import java.util.*;

public class ropes {

    static int mincost(int value[]){
        int count=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<value.length;i++){
            pq.add(value[i]);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            count+=a+b;
            pq.add(a+b);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] A=new int[b];
        for(int i=0;i<b;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(mincost(A));
        sc.close();
    }
}
