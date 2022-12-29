import java.util.*;

public class bt {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static Scanner sc=null;

    public static void main(String[] args) {
         sc=new Scanner(System.in);
         createtree();
    }

    static Node createtree(){
        Node root=null;
        int data=sc.nextInt();
        if(data==-1)return null;
        root=new Node(data);
        System.out.println("Enter left for "+ data);
        root.left=createtree();

        System.out.println("Enter right for "+ data);
        root.right=createtree();
        

        return root;
    }
}
