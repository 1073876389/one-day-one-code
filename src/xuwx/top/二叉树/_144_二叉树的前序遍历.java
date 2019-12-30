package xuwx.top.二叉树;


import java.util.ArrayList;
import java.util.List;

/**
 * leetcode : https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 *
 *@ClassName_144_二叉树的前序遍历
 *@Description 对于 前序遍历 需要知道的是 节点的访问顺序 为 根节点,前序遍历左子树,前序遍历右子数
 *@Author wx.Xu
 *Date 2019/12/24 9:46
 *Version 1.0
 */
public class _144_二叉树的前序遍历 {

//    private static  List<Integer> ret = new ArrayList<Integer>();


    public static void main(String[] args) {

    }

    /**
     * 使用迭代的实现方式
     * 利用栈来实现
     * 1.将root 入栈
     * 2.循环执行一下操作,直到栈为空
     * 2.1弹出栈顶节点top,访问
     * 2.2 将 top.right 入栈
     * 2.3 将 top.left 入栈
     * 思考: 这里是利用了 栈的先进后出的特性 所以考虑前序遍历的特性 访问top 节点时,先右后左,那么下一次循环就是 左先出 满足了 前序遍历的条件;
     *
     */
//    public List<Integer> preorderTraversal(TreeNode root) {
//        Stack<TreeNode> nodes = new Stack<TreeNode>();
//        List<Integer> ret = new ArrayList<Integer>();
//        if(root!=null){
//            nodes.push(root);
//        }
//        while(!nodes.isEmpty()){
//            TreeNode top = nodes.pop();
//            ret.add(top.val);
//            if(null!=top.right){
//                nodes.push(top.right);
//            }
//            if(null!=top.left){
//                nodes.push(top.left);
//            }
//        }
//        return ret;
//    }


    /**
     * 递归方式实现
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        preorderTsal(root,ret);
        return ret;
    }

    public void preorderTsal(TreeNode root,List<Integer> ret){
        if(root==null){
            return ;
        }
        ret.add(root.val);
        preorderTsal(root.left,ret);
        preorderTsal(root.right,ret);
    }
}
