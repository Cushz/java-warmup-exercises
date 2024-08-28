package Chapter2;

public class Tree {
    public static void printTree(Node root)
    {
        if(root == null)
        {
            return;
        }
        printTree(root.getLeftNode());
        System.out.println(root);
        printTree(root.getRightNode());
    }
}
