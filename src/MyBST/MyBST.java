package MyBST;

import Node.TreeNode;

public class MyBST {
    TreeNode root;

    public TreeNode getRoot(){
        return root;
    }

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if (root == null){
            root=node;
        }
        else
        {
            TreeNode temp = root;
            TreeNode parent =null;
            while(temp != null){
                parent = temp;
                if(node.getData()<=temp.getData()){
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
            }
            if (node.getData() <= parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    public void traverseInOrder(TreeNode node){
        if(node != null){
            traverseInOrder(node.getLeft());
            System.out.println(node.getData() + ", ");
            traverseInOrder(node.getRight());
        }
    }

}
