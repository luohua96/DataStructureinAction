package cn.luohua96.leetcode;

/**
 * @author luohua96
 * @create 2019/9/2 9:01 下午
 */

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Question21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode current = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            } else {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            current = l2;
        } else {
            current = l1;
        }

        return listNode.next;
    }
}

//class ListNode {
//    int val;
//    ListNode next;
//
//    public ListNode(int val) {
//        this.val = val;
//    }
//}
