package main.java.ldd.link_list;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/11 15:52
 */

/*
*给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
*
* 输入：head = [1,2,3,4]
输出：[2,1,4,3]
* */
public class Solution24 {

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
        first.next = second;
        second.next = third;
        third.next = fourth;
        Solution24 solution24 = new Solution24();
        ListNode result = solution24.swapPairs(first);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode swapPairs(ListNode head){

        ListNode result = new ListNode(0,head);
        ListNode move = result;

        while(move.next != null && move.next.next != null){
            ListNode start = move.next; //要交换的两个元素
            ListNode end = move.next.next;
            move.next = end;
            start.next = end.next;
            end.next = start;
            move = start;

        }

        return result.next;



    }

}
