import java.util.*;
class Nodee{
    int data;
    Nodee left,right;
    Nodee(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinarySearchTree {
    public static void inOrder(Nodee root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static Nodee insert(Nodee curr, int nextData){
        if(curr==null){
            return new Nodee(nextData);
        }
        else if(curr.data>nextData){
            curr.left=insert(curr.left,nextData);
        }
        else{
            curr.right=insert(curr.right,nextData);
        }
        return curr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinarySearchTree b = new BinarySearchTree();
        Queue<Nodee> q = new LinkedList<>();
        int rootData=sc.nextInt();
        Nodee root = new Nodee(rootData);
        q.add(root);
        while(!q.isEmpty()){
            Nodee curr = q.poll();
            int nextData=sc.nextInt();
            if(nextData!=-1) {
                q.add(b.insert(curr, nextData));
            }
        }
        b.inOrder(root);
    }
}
