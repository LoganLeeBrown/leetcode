class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode root)
    {
        if(root != null)
        {
            invert(root.left);
            invert(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
    }
}