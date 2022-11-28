import java.util.*;

public class Heapify_heapsort {


    static void swap(int A[],int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }

    static void heapify(int A[],int i,int n ){
        int largest = i;
        int left=i*2;
        int right=i*2+1;
        if(left<=n && A[left]>A[largest]){
            largest=left;
        }
        if(right<=n && A[right]>A[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(A,largest,i);
            heapify(A, largest, n);
        }
    }

    static void build_heap(int A[],int n){
        for(int i=n/2;i>0;i--){
            heapify(A, i, n);
        }
    }

    static void heapsort(int A[],int n){
        for (int i = n; i>1; i--) {
            swap(A, 1, i);
            heapify(A, 1, i-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] A=new int[b];
        for(int i=0;i<b;i++){
            A[i]=sc.nextInt();
        }
        build_heap(A, A.length-1); 
        heapsort(A, A.length-1);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        sc.close();       
    }
}
