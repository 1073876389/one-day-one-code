package xuwx.top.链表;

/**
 * leetcode : https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *
 *@ClassName_237_删除链表中的节点
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/4 18:29
 *Version 1.0
 */
public class _237_删除链表中的节点 {

    public void deleteNode(ListNode node) {
        /**
         * 思路 根据链表结构 我们可以得出 把node 上个节点的next 引用(指针) 指向 删除节点的下个 node 对象即可
         * 但是 我们没有办法 根据 node 对象 拿到上个节点  我们 可以 把 下个节点的 值 和 next 引用 直接给 当前删除 节点 (用后面的节点覆盖 即完成删除)
         */
        if(node==null|| node.next==null){
            return;
        }
        ListNode next = node.next;
        node.val=next.val;
        node.next=next.next;
    }
}
