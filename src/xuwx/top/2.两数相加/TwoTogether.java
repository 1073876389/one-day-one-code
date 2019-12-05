/**
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 *
 */

@SuppressWarnings("ALL")
public class TwoTogether{

    public static void main(String[] args) {


    }

    /**
     * 思路 遍历 组合出 参数 得到运算结果 根据 逆序规则分装入参数
     * @param nums
     * @param target
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode retNode = new ListNode(1);
        return retNode;
    }

    public int removeDuplicates(int[] nums) {

        int[] ret = nums;
        for (int i:ret){

        }
        nums = ret;
        return nums.length;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
