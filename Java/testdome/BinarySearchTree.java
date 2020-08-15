package testdome;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        if(root.value == value){
            return true;

        } else if(root.value > value){
            if(root.left == null) {
                return false;
            } else {
                return contains(root.left, value);
            }

        }else {
            if (root.right == null) {
                return false;
            } else {
                return contains(root.right, value);

            }
        }




//        if(root.left != null) {
//            if (value == root.left.value) {
//                return true;
//            }
//        }
//        if(root.right != null){
//           if (contains(root.right, value) == true) return true;
//        }
//        if(root.left != null){
//            if (contains(root.left, value) == true) return true;
//        }
//
//        if (root.left != null && root.value > value)
//            return contains(root.left, value);
//        else if (root.right != null & root.value < value)
//            return contains(root.right, value);


    }

    public static void main(String[] args) {
        Node n6 = new Node(6, null, null);
        Node n5 = new Node(5, n6, null);
        Node n4 = new Node(4, null, null);
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, n4, n5);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
        System.out.println(contains(n3, 3));

    }
}
