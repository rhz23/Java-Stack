package entities;

public class Node {
    private int data;                       //data that is being stored
    private Node refNode = null;            //reference to the next node (that is below that)

    public Node(){
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
