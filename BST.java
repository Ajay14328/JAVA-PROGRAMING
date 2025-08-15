class BST{
    static class Node{
        int data;
        Node right;
        Node left;
      Node(int data){
        this.data=data;
      }
    }
    //insertion of data
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    //display the result data
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
     
    }
    //search an element
    public static boolean search(Node root,int target){
        if(root==null){
            return false;
        }
        
        if(root.data>target){
            return search(root.left,target);
        }
        else if(root.data==target){
            return true;
        }

        else {
           return search(root.right,target);
        
        }
    }
//  //delete an element
//    public static Node delete(Node root,int element){
//     if(root.data>element){
//         root.left=delete(root.left,element);
//     }

//     else if(root.data<element){
//           root.right=delete(root.right,element);
//     }
//     else{
//         //case 1
//         if(root.left==null&&root.right==null){
//             return null;
//         }
//         //case 2
//         if(root.right==null ){
//             return root.left;
//         }
//         else if(root.left==null){
//             return root.right;
//         }
//         //case 3
//         Node case3=deletemethod(root.right);
//         root.data=case3.data;

//     }
//    }

    public static void main(String [] args){
        int val[]={5,1,3,4,2,7};
        // int n=val.length;
        Node root=null;
        for (int i = 0; i< val.length;i++) {
         root = insert(root,val[i]);
            
        }
        int key=2;
       System.out.println(search(root,key));
        
        inorder(root);

    }
}