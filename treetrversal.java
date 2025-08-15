class treetrversal{
    static class Node{
    int data;
    Node left;
    Node right;
    public Node(int value){
        data=value;
        left=right=null;
    }
    }   
    //Inorder
    static void inorder(Node node){
        if(node== null)return;
        inorder(node.left);
        System.out.println(node.data);
          inorder(node.right);
    }
    // preorder
    static void preorder(Node node){
        if(node== null)return;
        preorder(node.left);
          preorder(node.right);
          System.out.println(node.data);
    }
    // postorder
    static void postorder(Node node){
        if(node== null)return;
        System.out.println(node.data);
        postorder(node.left);
          postorder(node.right);
       
    }
    public static void main(String [] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("inorder");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);
    }
}