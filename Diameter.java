class Node{
    int data;
    Node left;
    Node right;
    public Node(int value){
        data=value;
        left=right=null;
    }
    }
//diameter of a tree
public class Diameter{
    static int Diameter=0;
    static int Height(Node node){
        if(node ==null)return 0;
        int leftheight=Height(node.left);
         int rightheight=Height(node.right);
         Diameter=Math.max(Diameter,leftheight+rightheight);
         return 1+Math.max(leftheight,rightheight);
    }   
    public static void main(String [] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        Height(root);
        System.out.println(Diameter);
       
    }
}