package cn.luohua96.leetcode;

/**
 * @author luohua96
 * @create 2019/9/2 10:03 下午
 */

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class Question19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        int length=0;
        if (head==null){
            length=0;
            return head;
        }
        while (head!=null){
            length++;
            head=head.next;
        }
        for(int i=1;i<=length;i++){
            if(i!=length-n+2){
                head=head.next;
            }else {
                head.next=head.next.next;
                break;
            }
        }


        return head;

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
