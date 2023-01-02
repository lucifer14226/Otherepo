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
         Node root=createtree();
        System.out.println(heighttree(root));
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

    static void Inorder(Node root){
        if(root==null)return;
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    static void preorder(Node root){
        if(root==null)return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
        
    }

    static int heighttree(Node root){
        if(root==null)return 0;
        return Math.max(heighttree(root.left),heighttree(root.right))+1;
    }
    static int sizetree(Node root){
        if(root==null)return 0;
        return sizetree(root.left)+sizetree(root.right)+1;
    }
}
