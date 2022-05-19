package pro.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintHeightOfBinaryTree {

    static class Node {
        int key;
        Node left;
        Node right;
    }

    // Utility function to create
// a new node
    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String args[]) {
        Node root = newNode(1);
        root.left = newNode(12);
        root.right = newNode(13);

        root.right.left = newNode(14);
        root.right.right = newNode(15);

        root.right.left.left = newNode(21);
        root.right.left.right = newNode(22);
        root.right.right.left = newNode(23);
        root.right.right.right = newNode(24);

        System.out.println("Height(Depth) of tree is: " + getHeightOfBT(root));
        System.out.println("Depth of tree is: " +getDepthByLevelOrder(root,1));

    }

    public static int height(Node root)
    {
        // base case: empty tree has a height of 0
        if (root == null) {
            return 0;
        }
        // recur for the left and right subtree and consider maximum depth
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int getHeight(Node root) {
        int h = 0;

        Queue<Node> q = new LinkedList<>();


        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node t = q.peek();
            q.remove();


            if (t == null) {
                h++;
            }
            if (t != null) {
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
            } else if (!q.isEmpty()) {
                q.add(null);
            }
        }
        return h;
    }

static int level=0;
    public static int getHeightOfBT(Node node) {
        if (node == null) {
            return 0;
        } else {
            int l = getHeightOfBT(node.left);
            int r = getHeightOfBT(node.right);

            if(l<r){
                return r+1;
            }else
                return l+1;
        }
    }

    public static int getDepthByLevelOrder(Node root,int l){
        if(root == null){
            return 0;
        }
        if(level <l){
            level=l;
        }
        getDepthByLevelOrder(root.left,l+1);
        getDepthByLevelOrder(root.right,l+1);

        return level;
    }

}
