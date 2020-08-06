package FBABCS;

//must return the height of binary tree as an int
public class TreeHeight {
    
}
public static int height(Node root){
    if(root==null)
    return -1;

    int left= height(root.left);
    int right =height(root.right);
    return Math.max(left, right)+1;

}