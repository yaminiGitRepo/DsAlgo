package pro.binaryTree;

public class PrintLeftView {
    static int currentLevel=0;
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String args[]) {

        PrintLeftView.Node root = newNode(1);
        root.left =  newNode(2);
        root.right =  newNode(3);
        root.left.left =  newNode(4);
        root.left.right =  newNode(5);


        printLeftView(root,1);
    }

    private static void printLeftView(Node root, int level) {
        if(root ==null){
            return ;
        }
        if(currentLevel<level){
            System.out.println(root.data);
            currentLevel++;
        }
        printLeftView(root.left,level+1);
        printLeftView(root.right,level+1);

    }


}
