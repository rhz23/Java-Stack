package entities;

public class Stack {

    private Node refLastNodeIn;

    public Stack() {
        this.refLastNodeIn = null;
    }

    public boolean isEmpty() {
        return refLastNodeIn == null ? true : false;        //return true if refLastNodeIn is null ou false if not null
    }

    public Node top() {
        return refLastNodeIn;
    }

    public void push(Node newNode){
        Node refAux = refLastNodeIn;
        refLastNodeIn = newNode;
        refLastNodeIn.setRefNode(refAux);
    }

    public Node pop(){
        if(!isEmpty()){
            Node nodePoped = refLastNodeIn;
            refLastNodeIn = refLastNodeIn.getRefNode();
            return nodePoped;
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        String returnString = "--------------\n";
        returnString += "   Stack       \n";
        returnString += "--------------\n";

        Node auxNode = refLastNodeIn;
        while(true){
            if(auxNode != null){
                returnString += "[Node{data=" + auxNode.getData() + "}]\n";
                auxNode = auxNode.getRefNode();
            }
            else{
                break;
            }
        }
        returnString += "===============\n";
        return returnString;
    }
}
