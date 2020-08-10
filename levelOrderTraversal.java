package FBABCS;

import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    
public static void levelOrder(Node root){
    if(root==null)
    return; 
    Queue<Node> queue= new LinkedList<Node>();
    queue.add(root);

    while(!queue.isEmpty()){
        Node node= queue.poll();
        System.out.print(node.data+" "); 

        if(node.left!=null)
            queue.add(node.left);
        if(node.right!=null)
        queue.add(node.right);
    }

}