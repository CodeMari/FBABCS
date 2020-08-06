package FBABCS;

//complete the preOrder function below, which has 1 parameter: a pointer to the root of a binary tree. it must print the values in the tree's preorder traversal as a single line of space-separated values

public class Node {
    int data;
    Node left; 
    Node right;

    Node(int data){
        this.data=data;
        left=null; 
        right=null;
    }
    
}
class Solution{

public static void preOrder(Node root){
    if(root==null)
    return; 

    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}
public static Node insert(Node root, int data) {
    if(root == null) {
        return new Node(data);
    } else {
        Node cur;
        if(data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    Node root = null;
    while(t-- > 0) {
        int data = scan.nextInt();
        root = insert(root, data);
    }
    scan.close();
    preOrder(root);
}	
}
