import java.util.HashMap;
import java.util.Scanner;

public class DistantElementInWindow {
    
    static void distant_element(int[] A,int k){
       HashMap<Integer,Integer>bags=new HashMap<>();
        for (int i = 0; i < k; i++) {
            bags.put(A[i],bags.getOrDefault(A[i], 0)+1);
        }
        System.out.println(bags.size());
        for (int i = k; i < A.length; i++) {
            if(bags.get(A[i-k])==1){
                bags.remove(A[i-k]);
            }
            else{
                bags.put(A[i-k],bags.get(A[i-k])-1);
            }
            bags.put(A[i],bags.getOrDefault(A[i],0)+1);
            
            System.out.println(bags.size());
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] nums=new int[b];
        for(int i = 0;i < nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        distant_element(nums,k);
        sc.close();
    }
}
