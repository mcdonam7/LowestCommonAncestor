//Mary McDonald

//15316382  
//Lowest Common Ancestor - s.engineering //
public class LCAmain<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Node left, right;   //null if empty

        private Key key;       
        private Value value;   

        private Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

}