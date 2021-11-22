package main.java.ldd.link_list;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/11 17:16
 */

/*
*给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置
*输入：head = [1,2,3,4,5], k = 2
输出：[4,5,1,2,3]
* */
public class Solution61 {

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
        Solution61 solution61 = new Solution61();
        ListNode result = solution61.rotateRight(first,4);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode rotateRight(ListNode head, int k ){

        int length = 0;
        ListNode test = new ListNode(0,head);
        while(test.next != null){
            length++;
            test = test.next;
        }
        if(length == 0)
            return head;
        int loop = k % length;
       // System.out.println(length);

        ListNode result = new ListNode(0,head);
        ListNode move = result;
        for(int i = 0;i<length;i++){

            if(i==length-loop){

                result.next = move.next;
                test.next = head;
                move.next = null;
                return result.next;
            }
            move= move.next;

        }

        return result.next;



    }


}
