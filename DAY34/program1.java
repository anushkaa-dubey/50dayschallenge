// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
    public void flatten(TreeNode root) {
        find(root);
        
    }

    public TreeNode find(TreeNode root){
        if(root==null) return null;

        
        TreeNode templ = find(root.left);
        TreeNode tempr = find(root.right);

        if(root.left!=null){
            TreeNode rightfirst = root.right;
            root.right = root.left;
            root.left=null;

            if(templ!=null) templ.right = rightfirst;
        }

        if(tempr!=null) return tempr;
        if(templ!=null) return templ;
        return root;
    }


}
