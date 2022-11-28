import java.util.*;
import java.util.Stack;

public class previous {

    static void previoussmaller(int test[]){
        Stack<Integer> st= new Stack<>();
        for(int i=1;i<test.length;i++){
            while(st.peek()>=test[i] && !st.isEmpty()){
                st.pop();
            }
            if(st.isEmpty()){
               System.out.print(-1);
            }
            else System.out.println(st.peek());
            st.push(test[i]); 
        }
         
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] test=new int[size];
        for(int i=0;i<size;i++){
            test[i]=sc.nextInt();
        }
        previoussmaller(test);
        sc.close();
        
    }
}
