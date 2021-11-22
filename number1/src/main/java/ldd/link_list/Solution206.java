package main.java.ldd.link_list;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/12 15:42
 */

/*
* 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表
*
* */
public class Solution206 {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        Solution206 solution206 = new Solution206();
        ListNode result = solution206.reverseList(first);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode reverseList(ListNode head) {

        if(head == null)
            return  head;
        ListNode prev = null;
        ListNode move = head;
        while (move != null) {
            ListNode next = move.next;
            move.next = prev;
            prev = move;
            move = next;

        }
        return prev;

    }
}
