import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
        left=right=null;
    }
}
public class BinaryTree {
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void preOrder(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rootData=sc.nextInt();
        Node root = new Node(rootData);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            int leftData=sc.nextInt();
            if(leftData!=-1){
                curr.left=new Node(leftData);
                q.add(curr.left);
            }
            int rightData=sc.nextInt();
            if(rightData!=-1){
                curr.right=new Node(rightData);
                q.add(curr.right);
            }
        }
        BinaryTree b = new BinaryTree();
        System.out.println("Inorder traversal : ");
        b.inOrder(root);
        System.out.println();
        System.out.println("Preorder traversal : ");
        b.preOrder(root);
        System.out.println();
        System.out.println("Postorder traversal : ");
        b.postOrder(root);
    }
}
