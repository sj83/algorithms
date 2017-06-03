package Trees;

public class BST {

    public TreeNode root = null;
    
    public static void main(String[] args){
        int[] values = {3,5,2,8,6,45,23};
        
        BST bst = new BST();
        bst.createBST(values);
    }
    
    public void createBST(int[] values){
        for(int value :  values){
            root = createBST(root, value);
        }
        
        print(root);
        
    }
    
    private TreeNode createBST(TreeNode node, int value){
        if(node == null){
            TreeNode newNode = new TreeNode();
            newNode.val = value;
            return newNode;
        }
      
        if(value >= node.val){
            node.right = createBST(node.right, value);
        }else{
            node.left = createBST(node.left, value);
        }
        
        return node;
    }
    
    private void print(TreeNode node){
        if(node == null){
            return;
        }
        
        print(node.left);
        System.out.println(node.val);
        print(node.right);
    }
    
    private static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
}
