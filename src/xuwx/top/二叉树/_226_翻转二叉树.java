package xuwx.top.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leetcode : https://leetcode-cn.com/problems/invert-binary-tree/
 *
 *@ClassName_226_翻转二叉树
 *@Description 题目目的 : 让每一个节点的左右节点都进行交换  实际上就是对节点的遍历 目前可以使用 前序,中序,后序,层级遍历(非迭代方式实现)
 *@Author wx.Xu
 *Date 2019/12/23 14:06
 *Version 1.0
 */
public class _226_翻转二叉树 {


    public static void main(String[] args) {

    }

//    public TreeNode invertTree(TreeNode root) {
//        //使用前序遍历
//        if(root==null){
//            return root;
//        }
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp ;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }


    public TreeNode invertTree(TreeNode root) {
        //使用层序遍历
        if(root==null){
            return root;
        }
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.offer(root);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp ;
            if(node.right!=null){
                nodes.offer(node.right);
            }
            if(node.left!=null){
                nodes.offer(node.left);
            }
        }
        return root;
    }
}


