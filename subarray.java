import java.util.*;
/**
 * subarray
 */
public class subarray {


    static void givensubaaray(int a[],int sum){
        int start=0;
        int end=-1;
        int cursum=0;
        HashMap<Integer, Integer>checksum=new HashMap<>();
        for(int i=0;i<a.length;i++){
            cursum+=a[i];
            if(cursum-sum==0){
                start=0;end=i;
                break;
            }
            if(checksum.containsKey(cursum-sum)){
                start=checksum.get(cursum-sum)+1;
                end=i;break;
            }
            checksum.put(cursum,i);
        }
        if(end==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(start+" "+ end);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        givensubaaray(a, sum);
        sc.close();
    }
}