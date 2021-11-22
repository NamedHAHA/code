package main.java.ldd.link_list;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/10 11:54
 */

/*
*将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
* 输入：l1 = [1,2,4], l2 = [1,3,4]
   输出：[1,1,2,3,4,4]
 *
 *
* */
public class Solution21 {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(4);
        head.next = first;
        first.next = second;

        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);
        third.next =fourth;
        fourth.next = fifth;
        Solution21 solution21 = new Solution21();

        ListNode result = solution21.mergeTwoLists(head,third);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }


    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode move  =result;
        while(l1 != null && l2 != null) {

            if(l1.val<l2.val) {
                move.next = l1;
                move = move.next;
                l1 = l1.next;
            } else {
                move.next=l2;
                move=move.next;
                l2=l2.next;
            }

        }
        if(l1 ==null){
            move.next=l2;
        } else {
            move.next = l1;
        }
        return result.next;

    }


}
