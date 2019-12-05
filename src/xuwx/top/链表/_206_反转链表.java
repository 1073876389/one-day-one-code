package xuwx.top.链表;

/**
 * leetcode : https://leetcode-cn.com/problems/reverse-linked-list/
 *
 *@ClassName_206_反转链表
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/4 18:19
 *Version 1.0
 */
public class _206_反转链表 {

    public ListNode reverseList(ListNode head) {
        /**
         * 解题思路: 链表反转,递归 找到 重复的相同点  前节点的next指向 后节点对象  反转成 后节点对象的next 指向 前节点对象;
         */
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     *  使用头插法  ;使用 临时的temp 节点 引用后续节点
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {

        ListNode newNode = null;
        while (head != null){
            ListNode tempNode = head.next;
            head.next = newNode;
            newNode = head;
            head = tempNode;
        }
        return newNode;
    }
}
