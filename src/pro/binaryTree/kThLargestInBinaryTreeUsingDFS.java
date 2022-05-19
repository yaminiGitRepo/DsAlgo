package pro.binaryTree;

public class kThLargestInBinaryTreeUsingDFS {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(10);

        printNodeAtKDistFromNode(root,0);
    }

static int k=0;
    public static int getkthLargestElement(Node root,int k) {
        if (root == null) {
            return 0;
        }
        if(k==3){
            System.out.println("value is="+root.data);
            return root.data;
        }
        getkthLargestElement(root.right,k-1);
        System.out.println(root.data+"k="+k);
        getkthLargestElement(root.left,k-1);
        return root.data;
    }

    static int level=2;
    public static void printNodeAtKDistFromNode(Node root,int l) {
        if (root == null) {
            return ;
        }
        if(level==l){
            System.out.println("value is="+root.data);
        }
        printNodeAtKDistFromNode(root.left,l+1);
        printNodeAtKDistFromNode(root.right,l+1);

    }
}
