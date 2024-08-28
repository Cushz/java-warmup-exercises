package Chapter2;

public class Node {
    private String label;
    private Node leftNode;
    private Node rightNode;
    public Node(String label)
    {
        this.label = label;
        this.leftNode = null;
        this.rightNode = null;
    }

    public Node getLeftNode() {
        return leftNode;
    }
    public Node getRightNode() {
        return rightNode;
    }
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
    public void addChild(Node node)
    {
        if (this.rightNode != null && this.leftNode != null)
        {
            System.out.println("Node is full");
        }
        else if (this.rightNode != null)
        {
            this.leftNode = node;
        }
        else if (this.leftNode != null)
        {
            this.rightNode = node;
        }
        else
        {
            this.leftNode = node;
        }
    }
    @Override
    public String toString()
    {
        return label;
    }
}
