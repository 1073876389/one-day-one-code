package xuwx.top.链表;

/**
 * leetcode : https://leetcode-cn.com/problems/linked-list-cycle/
 *
 *@ClassName_141_环形链表
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/4 18:13
 *Version 1.0
 */
public class _141_环形链表 {

    public boolean hasCycle(ListNode head) {
        /**
         * 解题思路 : 利用 快慢指针 来判断 如果 快慢指针有交点则说明 存在 环形结构
         */
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
