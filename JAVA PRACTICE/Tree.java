class Node{
    int value;
    Node left, right;

    Node(int value){
        this.value = value;
        left = right = null;
    }
}

public class Tree{

    Node root;

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.value, value);
        }
        else if(value > current.value){
            current.right = addRecursive(current.value, value);
        }

        return current;

    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    private Tree createBinartTree(){
        Tree bt = new Tree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    
        return bt;
    }
}