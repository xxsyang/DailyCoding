import java.util.ArrayList;
import java.util.List;


public class TreeMap {

    public class TreeNode {
        int key;
        int val;
        TreeNode left;
        TreeNode right;


        public TreeNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }

    private TreeNode root;


    public TreeMap() {
        root = null;
    }

    public void insert(int key, int val) {
        TreeNode insertedNode = new TreeNode(key, val);
        if(this.root == null){
            this.root = insertedNode;
            return;
        }
        TreeNode current = this.root;
        while(true){
            if(key < current.key){
                if(current.left == null){
                    current.left = insertedNode;
                    return;
                }
                current = current.left;
            }
            else if(key > current.key){
                if(current.right == null){
                    current.right = insertedNode;
                    return;
                }
                current = current.right;
            }
            else {
                current.val = val;
                return;
            }
        }
    }

    public int get(int key) {
        TreeNode current = root;

        while(current != null){
            if(current.key == key){
                return current.val;
            }
            else if(current.key < key){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }

        return -1;

    }

    public int getMin() {
        TreeNode current = root;
        if(root == null){
            return -1;
        }
        while(current.left != null){
            current = current.left;
        }
        return current.val;
    }

    public int getMax() {
        TreeNode current = root;
        if(root == null){
            return -1;
        }
        while(current.right != null){
            current = current.right;
        }
        return current.val;
    }

    public void remove(int key) {
        root = removeHelper(root, key);
    }


    public TreeNode predecessor(TreeNode node){
        node = node.left;
        while(node.right != null){
            node = node.right;
        }
        return node;
    }

    public TreeNode successor(TreeNode node){
        node = node.right;
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public TreeNode removeHelper(TreeNode node, int key){
        if(node == null){
            return null;
        }

        if(node.key < key){
            node.right = removeHelper(node.right, key);
        }
        if(node.key > key){
            node.left = removeHelper(node.left, key);
        }
        else{
            if(node.left == null){
                return node.right;
            }
            else if(node.right == null){
                return node.left;
            }

            TreeNode minNode = findMin(node.right);
            node.key = minNode.key;
            node.val = minNode.val;
            node.right = removeHelper(node.right, minNode.key);

        }
        return node;
    }

    public void inOrder(List<Integer> res, TreeNode root){
        if(root == null){
            return;
        }
        inOrder(res, root.left);
        res.add(root.key);
        inOrder(res, root.right);
    }

    public List<Integer> getInorderKeys() {
        List<Integer> res = new ArrayList<>();
        inOrder(res, root);
        return res;
    }
}




