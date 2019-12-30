package xuwx.top.二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * leetcode : https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 *@ClassName _94_二叉树的中序遍历
 *@Description  二叉树的中序遍历 ,先遍历左子树,然后 根节点,最后右子树;(特点 对于)
 *@Author wx.Xu
 *Date 2019/12/24 16:28
 *Version 1.0
 */
public class _94_二叉树的中序遍历 {
//    /**
//     *  递归方法实现
//     * @param root
//     * @return
//     */
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<Integer>();
//        inorderTsal(root,ret);
//        return ret;
//    }
//    public void inorderTsal(TreeNode root, List<Integer> ret) {
//        if(root!=null){
//            inorderTsal(root.left,ret);
//            ret.add(root.val);
//            inorderTsal(root.right,ret);
//        }
//    }

    /**
     * 迭代实现
     * 思考中序遍历的特点: 左右根 那么利用栈的先进后出特性 找到 左子树的最小叶子节点 然后开始
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ret = new ArrayList<Integer>();
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        TreeNode node = root;
        while(true){
            if (node!=null){
                nodes.push(node);
                node = node.left;
            }else{
                if (nodes.isEmpty()){
                    return ret;
                }else {
                    node =  nodes.pop();
                    ret.add(node.val);
                    node = node.right;
                }
            }
        }
    }
}
